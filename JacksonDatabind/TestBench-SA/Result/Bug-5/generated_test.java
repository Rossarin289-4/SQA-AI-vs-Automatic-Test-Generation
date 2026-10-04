package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:3>", "<empty>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.lang.String#indexOf(5 params)], [method java.lang.String#checkIndex(2 params)], [method java.lang.String#valueOf(1 params)], [method java.lang.String#valueOf(1 params)], [method java.lan...#1082#-235773", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class"}, new String[]{"<sample:5>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<null>", "<sample:4>", "<empty>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<null>"}}), new String[][]{{"add", "int,java.lang.Object", "6"}, {"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", "java.lang.Class", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", new String[]{"java.lang.String", "java.lang.Class[]"}, new String[]{"-1.5", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", "010", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<null>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:2>", "<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}}), new String[][]{{"isEmpty", "", "4"}, {"find", "java.lang.reflect.Method", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}}, 3), new String[][]{{"clear", "", "1"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:3>", "<sample:1>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "0"}, {"getRawType", "", "3"}, {"memberMethods", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", actual.getClass().getName());
  assertEquals("{isEmpty=false, size=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.Object] {getFieldCount=0, getMemberMethodCount=11, getModifiers=1, getName=java.lang.Object, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:1>", "<sample:4>", "<sample:7>"}, true), new String[][]{{"getDefaultConstructor", "", "6"}, {"addOrOverrideParam", "int,java.lang.annotation.Annotation", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:6>", "<sample:5>", "<sample:4>"}, true), new String[][]{{"hasAnnotation", "java.lang.Class", "2"}, {"getStaticMethods", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.util.List#copyOf(1 params)], [method java.util.List#of(2 params)], [method java.util.List#of(1 params)], [method java.util.List#of(5 params)], [method java.util.List#of(4 params)], [meth...#499#1179490017", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.util.List] {getFieldCount=0, getMemberMethodCount=33, getModifiers=1537, getName=java.util.List, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:6>", "<sample:2>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"getStaticMethods", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.util.List#copyOf(1 params)], [method java.util.List#of(2 params)], [method java.util.List#of(1 params)], [method java.util.List#of(5 params)], [method java.util.List#of(4 params)], [meth...#499#1179490017", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:1>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", "0", "<sample:1>"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=0, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}}, 3), new String[][]{{"add", "java.lang.annotation.Annotation", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<null>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"hasAnnotations", "", "1"}, {"getConstructors", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getStaticMethods", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.lang.Integer#numberOfLeadingZeros(1 params)], [method java.lang.Integer#numberOfTrailingZeros(1 params)], [method java.lang.Integer#bitCount(1 params)], [method java.lang.Integer#toStrin...#2317#-893053077", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:3>", "<sample:6>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getFieldCount=3, getMemberMethodCount=0, getModifiers=9, getName=generated.algorithm.SearchInputFactory_scaffolding$Gener...#244#2089405830", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<sample:4>"}}, 3), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 2), new String[][]{{"isPrimitive", "", "1"}, {"isArrayType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", "java.lang.reflect.Method", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 3), new String[][]{{"isPrimitive", "", "1"}, {"isArrayType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", "java.lang.reflect.Method", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:2>", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}}, 2), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:1>", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", "java.lang.Class", "<sample:3>"}}, 2), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 2), new String[][]{{"getAnnotationCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 2), new String[][]{{"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:2>"}}, 1), new String[][]{{"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 45, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}, 2), new String[][]{{"getName", "", "7"}, {"getParameter", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #2, annotations: null] {getIndex=2, getModifiers=1, getName=, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}, 3), new String[][]{{"getGenericParameterType", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"remove", "java.lang.Object", "3"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "3"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<empty>", "<empty>"}}, 1), new String[][]{{"remove", "java.lang.Object", "3"}, {"isEmpty", "", "6"}, {"trimToSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:3>", "<empty>", "<empty>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<sample:3>"}}, 1), new String[][]{{"isPublic", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 1), new String[][]{{"getGenericType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", ""}}, 3), new String[][]{{"annotations", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 12, new String[][]{}, 2), new String[][]{{"getAnnotated", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:5>", "<sample:1>", "true"}}, 2), new String[][]{{"getAnnotated", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:5>", "<sample:1>", "true"}}, 2), new String[][]{{"hasAnnotation", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<empty>", "<sample:1>", "true"}}, 2), new String[][]{{"hasAnnotation", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:2>", "<sample:4>", "<sample:3>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:2>", "<sample:4>", "<sample:3>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:2>", "<sample:5>", "true"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<empty>", "true"}}, 1), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", new String[]{"java.lang.String", "java.lang.Class[]"}, new String[]{"1.12345678", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:2>", "<sample:5>", "true"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<empty>", "true"}}, 3), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", actual.getClass().getName());
  assertEquals("{isEmpty=false, size=60}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:3>", "<sample:0>"}}, 2), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.Object; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#-1824092172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}, {"addOrOverrideParam", "int,java.lang.annotation.Annotation", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}, {"withMethod", "java.lang.reflect.Method", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.List#get(1 params)] {getAnnotationCount=0, getFullName=java.util.List#get(1 params), getGenericParameterTypes=[int], getModifiers=1025, getName=get, getParameterCount=1, getRawParame...#250#-1323839922", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}}, 1), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{class java.lang.Object=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy, class java.lang.Integer=GeneratedTestInputProxy}, {class...#244#1703068629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}}, 1), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.Object; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#-1824092172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:2>"}}, 2), new String[][]{{"getRawReturnType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<sample:3>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}, {"clone", "", "6"}, {"set", "int,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=2, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getValue", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<sample:6>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}, {"clone", "", "6"}, {"set", "int,java.lang.Object", "6"}, {"resolveParameterType", "int,com.fasterxml.jackson.databind.type.TypeBindings", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", actual.getClass().getName());
  assertEquals("{isEmpty=false, size=60}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:6>", "<sample:1>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:3>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}, {"clone", "", "6"}, {"set", "int,java.lang.Object", "6"}, {"setValue", "java.lang.Object,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}}, 1), new String[][]{{"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 34, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}}, 1), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"add", "int,java.lang.Object", "6"}, {"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:3>", "<sample:4>", "<sample:2>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", new String[]{}, new String[]{}, false, 62, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:1>", "<sample:0>", "<sample:0>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 2), new String[][]{{"get", "java.lang.Class", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 2), new String[][]{{"add", "java.lang.annotation.Annotation", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}, 1), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}, 1), new String[][]{{"get", "java.lang.Class", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 1), new String[][]{{"add", "java.lang.annotation.Annotation", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:4>", "<null>", "<sample:3>"}}, 1), new String[][]{{"annotations", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", "java.lang.Class,java.lang.Class,java.util.Map", "<null>", "<sample:2>", "<sample:0>"}}, 1), new String[][]{{"annotations", "", "6"}, {"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", "java.lang.Class,java.lang.Class,java.util.Map", "<null>", "<sample:2>", "<sample:0>"}}, 1), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 3), new String[][]{{"size", "", "6"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, isAbstra...#406#1123829549", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, isAbstra...#406#1123829549", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, isAbstra...#406#1123829549", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>"}, false), new String[][]{{"isPrimitive", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}), new String[][]{{"isPrimitive", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}), new String[][]{{"isPrimitive", "", "1"}, {"isArrayType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class"}, new String[]{"<sample:5>", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", new String[]{"java.lang.reflect.Constructor", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class", "<sample:6>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Constructor", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean"}, new String[]{"<empty>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<null>", "<sample:6>", "<sample:2>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", new String[]{"java.lang.reflect.Constructor", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:1>", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", "java.lang.reflect.Method", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[field java.lang.String#value], [field java.lang.String#coder], [field java.lang.String#hash]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:2>", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}}), new String[][]{{"add", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], , [constructor for java.lang.String, annotations: [null]], [constructor for java.lang...#1215#-106522813", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.Arrays#asList(1 params)] {getAnnotationCount=1, getFullName=java.util.Arrays#asList(1 params), getGenericParameterTypes=[T[]], getModifiers=137, getName=asList, getParameterCount=1, ...#284#49668359", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:2>", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", "java.lang.Class", "<sample:3>"}}), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:1>", "<sample:2>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getFieldCount=3, getMemberMethodCount=0, getModifiers=9, getName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#243#-426948191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}), new String[][]{{"setValue", "java.lang.Object,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}), new String[][]{{"getAnnotationCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}), new String[][]{{"getParameterAnnotations", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}}), new String[][]{{"withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: null] {getAnnotationCount=!NullPointerException, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}), new String[][]{{"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<sample:1>"}}), new String[][]{{"call", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}), new String[][]{{"getName", "", "6"}, {"getParameter", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #2, annotations: null] {getIndex=2, getModifiers=1, getName=, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<empty>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{value=[field java.lang.String#value], coder=[field java.lang.String#coder], hash=[field java.lang.String#hash]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:3>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<empty>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:5>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean", "<null>", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}}), new String[][]{{"remove", "java.lang.Object", "5"}, {"isEmpty", "", "6"}, {"addAll", "int,java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", "]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:2>", "<empty>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:2>", "<empty>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<empty>", "<sample:6>", "<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:4>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", "", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", "com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", new String[]{"java.lang.reflect.Constructor", "boolean"}, new String[]{"<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.lang.String#indexOf(5 params)], [method java.lang.String#checkIndex(2 params)], [method java.lang.String#valueOf(1 params)], [method java.lang.String#valueOf(1 params)], [method java.lan...#1082#-235773", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<empty>", "<sample:2>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}), new String[][]{{"trimToSize", "", "6"}, {"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<sample:3>", "<sample:0>"}, true), new String[][]{{"isPublic", "", "4"}, {"annotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:3>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<empty>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getGenericType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", "com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>"}}), new String[][]{{"getMember", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Constructor", actual.getClass().getName());
  assertEquals("public java.lang.String() {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=[], getAnnotations=[], getDeclaredAnnotations=[], getExceptionTypes=[], getGenericExceptionTypes=[], getGenericPara...#406#953764340", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:0>"}}), new String[][]{{"getAnnotated", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, false), new String[][]{{"resolveParameterType", "int,com.fasterxml.jackson.databind.type.TypeBindings", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class java.lang.Object=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy, class java.lang.Integer=GeneratedTestInputProxy} {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy, int=GeneratedTestInputProxy, class [Ljava.lang.String;=GeneratedTestInputProxy} {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<empty>", "true"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<empty>", "<sample:7>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:2>", "<sample:5>", "true"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<empty>", "true"}}), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:3>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, value=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#value], values=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values], array=[field ...#270#-750497811", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:1>", "<sample:1>"}, false, 1, new String[][]{}), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{}), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "6"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=, value=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#value], values=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values], a...#282#-1518340382", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.List#get(1 params)] {getAnnotationCount=0, getFullName=java.util.List#get(1 params), getGenericParameterTypes=[int], getModifiers=1025, getName=get, getParameterCount=1, getRawParame...#250#-1323839922", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#format(2 params)] {getAnnotationCount=0, getFullName=java.lang.String#format(2 params), getGenericParameterTypes=[class java.lang.String, class [Ljava.lang.Object;], getModifi...#354#2039936895", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>"}}), new String[][]{{"getAnnotationCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>"}}), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<null>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:3>", "<sample:0>"}}), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}, {"getModifiers", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("137", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:3>", "<sample:0>"}}), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}, {"getModifiers", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:3>", "<sample:0>"}}), new String[][]{{"getAnnotationCount", "", "4"}, {"getRawParameterType", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.Object; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#-1824092172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}}), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:0>", "<empty>", "<sample:2>"}}), new String[][]{{"listIterator", "int", "3"}, {"previous", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=1, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:0>"}, false), new String[][]{{"get", "java.lang.Class", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", actual.getClass().getName());
  assertEquals("{isEmpty=false, size=60}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", new String[]{"java.lang.String", "java.lang.Class[]"}, new String[]{"<a>b</a>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 15, new String[][]{}), new String[][]{{"get", "int", "6"}, {"getGenericType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 40, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", "com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>"}}), new String[][]{{"contains", "java.lang.Object", "6"}, {"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<empty>", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false), new String[][]{{"addOrOverrideParam", "int,java.lang.annotation.Annotation", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#charAt(1 params)] {getAnnotationCount=0, getFullName=java.lang.String#charAt(1 params), getGenericParameterTypes=[int], getModifiers=1, getName=charAt, getParameterCount=1, ge...#260#-1532740946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}), new String[][]{{"get", "java.lang.Class", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedField", actual.getClass().getName());
  assertEquals("[field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text] {getAnnotationCount=0, getFullName=generated.algorithm.SearchInputFactory_scaffolding$TypeSampl.., getModifiers=1, getName=t...#219#1498108473", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Constructor", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean"}, new String[]{"<null>", "<sample:4>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "4"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "4"}, {"addIfNotPresent", "java.lang.annotation.Annotation", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy, class java.lang.Integer=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<null>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "4"}, {"add", "java.lang.annotation.Annotation", "1"}, {"addIfNotPresent", "java.lang.annotation.Annotation", "2"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 2), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "4"}, {"add", "java.lang.annotation.Annotation", "1"}, {"annotations", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", "java.lang.Class,java.lang.Class,java.util.Map", "<empty>", "<empty>", "<null>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{class java.lang.Integer=GeneratedTestInputProxy}, {class java.lang.Object=GeneratedTestInputProxy, interface java.util.List=GeneratedTestInputProxy}, {interface java.util.List=GeneratedTestInputProx...#283#1662020093", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:3>", "<sample:1>"}}, 2), new String[][]{{"getParameterAnnotations", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:2>"}, false), new String[][]{{"memberMethods", "", "4"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:5>", "<empty>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:3>", "<sample:1>"}}, 2), new String[][]{{"getRawParameterType", "int", "5"}, {"call", "java.lang.Object[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean", "<null>", "<sample:3>", "false"}}), new String[][]{{"iterator", "", "4"}, {"next", "", "4"}, {"getGenericType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [B {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=byte[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-686490465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:3>", "<sample:0>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getFieldCount=3, getMemberMethodCount=0, getModifiers=9, getName=generated.algorithm.SearchInputFactory_scaffolding$Gener...#244#2089405830", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:4>", "<sample:9>", "<empty>", "<sample:1>"}}, 1), new String[][]{{"addOrOverride", "java.lang.annotation.Annotation", "4"}, {"annotations", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:2>", "<sample:12>", "<null>", "<sample:1>"}}, 1), new String[][]{{"addOrOverride", "java.lang.annotation.Annotation", "4"}, {"annotations", "", "4"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 36, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}}, 3), new String[][]{{"getDeclaringClass", "", "4"}, {"annotations", "", "4"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 43, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}}, 2), new String[][]{{"getDeclaringClass", "", "4"}, {"annotations", "", "4"}, {"retainAll", "java.util.Collection", "4"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean", "<sample:1>", "<sample:4>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<null>", "<sample:1>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", "com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 12, new String[][]{}, 1), new String[][]{{"getAnnotated", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:0>"}}), new String[][]{{"getAnnotated", "", "4"}, {"hasAnnotation", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:0>"}}, 1), new String[][]{{"getAnnotated", "", "4"}, {"hasAnnotation", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:0>"}}, 3), new String[][]{{"getAnnotated", "", "4"}, {"hasAnnotation", "java.lang.Class", "1"}, {"hasAnnotations", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:1>", "<sample:3>", "<sample:6>"}}, 3), new String[][]{{"getAnnotated", "", "4"}, {"hasAnnotation", "java.lang.Class", "1"}, {"getAnnotated", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[field java.lang.String#value], [field java.lang.String#coder], [field java.lang.String#hash]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 3), new String[][]{{"get", "java.lang.Class", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<null>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", "java.lang.reflect.Method", "<sample:2>"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", new String[]{"java.lang.String", "java.lang.Class[]"}, new String[]{"1D1.234567890+12346<ab</a>> ", "<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:0>", "<sample:0>"}, false), new String[][]{{"size", "", "5"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "5"}, {"get", "java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:4>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:1>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false), new String[][]{{"withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<empty>"}, false), new String[][]{{"getGenericType", "", "4"}, {"getGenericType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2), new String[][]{{"withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "6"}, {"annotations", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<sample:0>"}}, 3), new String[][]{{"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<sample:0>"}}, 3), new String[][]{{"call1", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:3>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{value=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#value], values=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values], array=[field generated.algori...#254#179456015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<null>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:1>", "<sample:4>", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:4>"}}, 1), new String[][]{{"call1", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", "java.lang.reflect.Method", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean", "<sample:0>", "<null>", "false"}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1), new String[][]{{"isEmpty", "", "0"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.lang.String#indexOf(5 params)], [method java.lang.String#checkIndex(2 params)], [method java.lang.String#valueOf(1 params)], [method java.lang.String#valueOf(1 params)], [method java.lan...#1082#-235773", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:0>"}}, 3), new String[][]{{"getMember", "", "6"}, {"getGenericParameterTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#length(0 params)] {getAnnotationCount=0, getFullName=java.lang.String#length(0 params), getGenericParameterTypes=[], getModifiers=1, getName=length, getParameterCount=0, getRa...#254#1875994588", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", "java.lang.reflect.Method", "<sample:3>"}}), new String[][]{{"annotations", "", "3"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<null>", "<sample:7>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", "\u00e9", "<sample:1>"}}), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", "java.lang.reflect.Method", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<sample:2>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", "java.lang.reflect.Method", "<sample:2>"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 27, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}, {"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", ""}}), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}), new String[][]{{"getAnnotation", "java.lang.Class", "5"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 2), new String[][]{{"getAnnotation", "java.lang.Class", "5"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:3>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.List#get(1 params)] {getAnnotationCount=0, getFullName=java.util.List#get(1 params), getGenericParameterTypes=[int], getModifiers=1025, getName=get, getParameterCount=1, getRawParame...#250#-1323839922", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 1), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 1), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"annotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 1), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"annotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"annotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"annotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"annotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:0>", "<null>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.annotation.Annotation", "0"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 3), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"getModifiers", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<sample:3>", "<sample:7>", "<empty>", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 2), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"getModifiers", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 2), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"getModifiers", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("137", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 2), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"getModifiers", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1025", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 3), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getGenericParameterType", "int", "5"}, {"hasAnnotation", "java.lang.Class", "3"}, {"getParameter", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #1, annotations: null] {getIndex=1, getModifiers=137, getName=, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 3), new String[][]{{"getMember", "", "6"}, {"getGenericParameterTypes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 3), new String[][]{{"getMember", "", "6"}, {"getGenericParameterTypes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.String, class [Ljava.lang.Object;]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 3), new String[][]{{"getMember", "", "6"}, {"getGenericParameterTypes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 3), new String[][]{{"getMember", "", "6"}, {"getGenericParameterTypes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[int]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 3), new String[][]{{"resolveParameterType", "int,com.fasterxml.jackson.databind.type.TypeBindings", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<empty>"}}, 1), new String[][]{{"getMember", "", "6"}, {"getGenericParameterTypes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
