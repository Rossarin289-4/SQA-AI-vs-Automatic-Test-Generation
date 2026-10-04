package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:3>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"getLocale", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:3>"}}), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}}), new String[][]{{"applyLocalizedPattern", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:6>"}}), new String[][]{{"constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf<java.lang.Object<[simple type, class java.lang.Object]>] {getErasedSignature=Lgenerated/algorithm/SearchInputFacto...#652#-698828469", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:6>"}}), new String[][]{{"with", "com.fasterxml.jackson.core.Base64Variant", "0"}, {"with", "java.util.Locale", "6"}, {"getTypeResolverBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}}, 1), new String[][]{{"getClassIntrospector", "", "5"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<null>"}}, 2), new String[][]{{"withDateFormat", "java.text.DateFormat", "3"}, {"getBase64Variant", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}}, 3), new String[][]{{"withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "2"}, {"getBase64Variant", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:1>"}}, 3), new String[][]{{"nameForConstructorParameter", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getDisplayName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"getBase64Variant", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getAnnotationIntrospector", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 1), new String[][]{{"encodeBase64BitsAsByte", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("65", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}}, 1), new String[][]{{"translate", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"getVisibilityChecker", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}}, 2), new String[][]{{"applyLocalizedPattern", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"getAnnotationIntrospector", "", "0"}, {"findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:7>"}}, 3), new String[][]{{"getVisibilityChecker", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}}, 1), new String[][]{{"getTimeZone", "", "3"}, {"getDSTSavings", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"with", "java.util.Locale", "7"}, {"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isIsGetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}}, 2), new String[][]{{"getExtension", "char", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"defaultImpl", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}, 2), new String[][]{{"getTimeZone", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:6>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:3>"}}, 2), new String[][]{{"getDateFormat", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:2>"}}, 2), new String[][]{{"getLocale", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:5>"}}, 3), new String[][]{{"inDaylightTime", "java.util.Date", "2"}, {"getLastRuleInstance", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}}, 2), new String[][]{{"getHandlerInstantiator", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"toLanguageTag", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"nameForConstructorParameter", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 2), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"forDirectClassAnnotations", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:2>", "<sample:1>"}}, 3), new String[][]{{"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:6>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:7>"}}, 2), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "0"}, {"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 1), new String[][]{{"getClassIntrospector", "", "3"}, {"forDeserialization", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}}, 3), new String[][]{{"getTypeFactory", "", "3"}, {"withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getOffsets", "long,int[]", "3"}, {"getDisplayName", "", "1"}, {"getDisplayName", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:1>"}}, 2), new String[][]{{"nameForSetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "4"}, {"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}, 2), new String[][]{{"getClassIntrospector", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}, 2), new String[][]{{"getBase64Variant", "", "3"}, {"getVisibilityChecker", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"clone", "", "1"}, {"getDateFormatSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[av. J.-C., ap. J.-C.], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[janvier, f\u00e9vrier, mars, avril, mai, juin, juillet, ao\u00fbt, se.., getShortMonths=[janv., f\u00e9v...#409#-1206735206", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:0>"}}, 3), new String[][]{{"withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "0"}, {"getHandlerInstantiator", "", "0"}, {"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "1"}, {"getVisibilityChecker", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}, 1), new String[][]{{"getDisplayVariant", "java.util.Locale", "1"}, {"getDisplayLanguage", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:11>"}}, 2), new String[][]{{"getClassIntrospector", "", "5"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}, 3), new String[][]{{"getAnnotationIntrospector", "", "3"}, {"findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"useDaylightTime", "", "1"}, {"getOffsetsByStandard", "long,int[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:7>"}}, 3), new String[][]{{"toLanguageTag", "", "0"}, {"getISO3Country", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}}, 3), new String[][]{{"getDateFormatSymbols", "", "5"}, {"getShortWeekdays", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, dim., lun., mar., mer., jeu., ven., sam.]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}, 3), new String[][]{{"getVisibilityChecker", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:8>", "<sample:4>"}}, 3), new String[][]{{"withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "7"}, {"withDateFormat", "java.text.DateFormat", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 1), new String[][]{{"setTimeZone", "java.util.TimeZone", "3"}, {"toLocalizedPattern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HH:mm:ss", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:9>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}, 2), new String[][]{{"getDateFormat", "", "3"}, {"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample16:00:00 {length=14}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}}, 1), new String[][]{{"getDateFormat", "", "1"}, {"parse", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:4>"}}, 3), new String[][]{{"getTypeFactory", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:7>", "<sample:6>"}}, 2), new String[][]{{"getTypeResolverBuilder", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "5"}, {"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample06:07:08 {length=14}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:1>"}}, 3), new String[][]{{"withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "2"}, {"getHandlerInstantiator", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}, 1), new String[][]{{"findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:0>", "<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:6>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false), new String[][]{{"nameForSetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:0>"}}), new String[][]{{"forDirectClassAnnotations", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"getDateFormatSymbols", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BC, AD], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[January, February, March, April, May, June, July, August, S.., getShortMonths=[Jan, Feb, Mar, Apr, May,...#388#-1242400131", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:4>"}}), new String[][]{{"getLocale", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}), new String[][]{{"findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "2"}, {"getAlwaysAsId", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<empty>"}}), new String[][]{{"getTypeResolverBuilder", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:3>"}}), new String[][]{{"getExtensionKeys", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"encodeBase64BitsAsByte", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:7>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"with", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "5"}, {"isGetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"getVisibilityChecker", "", "2"}, {"withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}), new String[][]{{"findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}}), new String[][]{{"getPropertyNamingStrategy", "", "2"}, {"translate", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}}), new String[][]{{"isLenient", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:9>"}, false), new String[][]{{"getBase64Variant", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "7"}, {"getVisibilityChecker", "", "7"}, {"isSetterVisible", "java.lang.reflect.Method", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}), new String[][]{{"withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "0"}, {"getClassIntrospector", "", "7"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"decode", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder", "0"}, {"decodeBase64Char", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false), new String[][]{{"applyPattern", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<null>"}}), new String[][]{{"getClassIntrospector", "", "7"}, {"forDeserialization", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<null>"}}), new String[][]{{"getTypeFactory", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"nameForSetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}), new String[][]{{"getOffsetsByStandard", "long,int[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:4>"}}), new String[][]{{"translate", "java.lang.String", "6"}, {"nameForConstructorParameter", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<null>"}}), new String[][]{{"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}), new String[][]{{"getTypeFactory", "", "6"}, {"constructRawCollectionLikeType", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory...#648#600299398", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"getTypeResolverBuilder", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"isFieldVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedField", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"forClassAnnotations", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:4>"}}), new String[][]{{"getTypeFactory", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "2"}, {"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:1>"}}), new String[][]{{"getDisplayVariant", "java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:6>"}, false), new String[][]{{"with", "java.util.Locale", "4"}, {"getClassIntrospector", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}), new String[][]{{"getClassIntrospector", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"getTimeZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:4>"}, false), new String[][]{{"withDateFormat", "java.text.DateFormat", "3"}, {"getHandlerInstantiator", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}}), new String[][]{{"getLanguage", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:0>"}}), new String[][]{{"getID", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}), new String[][]{{"getDateFormat", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:5>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"getClassIntrospector", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}}), new String[][]{{"getVisibilityChecker", "", "3"}, {"isFieldVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedField", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}), new String[][]{{"getTypeResolverBuilder", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}), new String[][]{{"getTypeResolverBuilder", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}), new String[][]{{"format", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6:07:08 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}}), new String[][]{{"getDateFormat", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"decodeBase64Char", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:1>"}, false), new String[][]{{"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "1"}, {"getPropertyNamingStrategy", "", "2"}, {"nameForConstructorParameter", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}), new String[][]{{"constructRawCollectionLikeType", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class int, contains [simple type, class java.lang.Object]] {getErasedSignature=I, getGenericSignature=I<Ljava/lang/Object;>;, getTypeName=[collection-like type; class int, conta...#485#-879737704", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}}), new String[][]{{"getDisplayCountry", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:1>", "<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"with", "java.util.TimeZone", "4"}, {"getLocale", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"getTypeProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"toLocalizedPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h:mm:ss a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:1>"}}), new String[][]{{"with", "java.util.Locale", "7"}, {"getBase64Variant", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "0"}, {"getBase64Variant", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:3>"}}), new String[][]{{"getPropertyNamingStrategy", "", "1"}, {"nameForField", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedField,java.lang.String", "3"}, {"nameForSetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}), new String[][]{{"getLocale", "", "4"}, {"getDisplayCountry", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SAMPLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"withDateFormat", "java.text.DateFormat", "7"}, {"getPropertyNamingStrategy", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:6>"}, false), new String[][]{{"getPropertyNamingStrategy", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}), new String[][]{{"constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Object, [simple type, class java.lang.Object] -> [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getE...#657#-1099436490", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}}), new String[][]{{"getHandlerInstantiator", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"getClassIntrospector", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}), new String[][]{{"getLocale", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:2>"}, false), new String[][]{{"getVisibilityChecker", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:7>"}}), new String[][]{{"typeProperty", "java.lang.String", "7"}, {"isTypeIdVisible", "", "2"}, {"defaultImpl", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=sample, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:4>", "<sample:6>"}, false), new String[][]{{"getPropertyNamingStrategy", "", "0"}, {"translate", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"getTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:3>", "<sample:5>"}}), new String[][]{{"constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:3>"}}), new String[][]{{"getLastRuleInstance", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}), new String[][]{{"getVisibilityChecker", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}), new String[][]{{"getPropertyNamingStrategy", "", "6"}, {"nameForConstructorParameter", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"getISO3Country", "", "3"}, {"hasExtensions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:3>"}}), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "5"}, {"getVisibilityChecker", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}}), new String[][]{{"inDaylightTime", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false), new String[][]{{"findEnumValue", "java.lang.Enum", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>"}}), new String[][]{{"getTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}), new String[][]{{"getPropertyNamingStrategy", "", "5"}, {"nameForField", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedField,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}), new String[][]{{"getVisibilityChecker", "", "4"}, {"withCreatorVisibility", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"getTimeZone", "", "7"}, {"inDaylightTime", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:7>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}), new String[][]{{"with", "com.fasterxml.jackson.core.Base64Variant", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:5>"}}), new String[][]{{"getBase64Variant", "", "1"}, {"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "6"}, {"getHandlerInstantiator", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}), new String[][]{{"getTypeResolverBuilder", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}), new String[][]{{"getDateFormat", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:6>"}}), new String[][]{{"getLocale", "", "0"}, {"getDisplayLanguage", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:5>"}}), new String[][]{{"getTypeResolverBuilder", "", "6"}, {"typeIdVisibility", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}), new String[][]{{"getPropertyNamingStrategy", "", "5"}, {"nameForSetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "5"}, {"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getOffsetsByStandard", "long,int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:4>"}}), new String[][]{{"getTypeResolverBuilder", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"getClassIntrospector", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false), new String[][]{{"getClassIntrospector", "", "1"}, {"forDeserialization", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>"}}), new String[][]{{"with", "java.util.TimeZone", "5"}, {"getAnnotationIntrospector", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:5>"}, false), new String[][]{{"with", "java.util.Locale", "0"}, {"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "4"}, {"getTimeZone", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}), new String[][]{{"getUnicodeLocaleType", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:8>"}}), new String[][]{{"getPropertyNamingStrategy", "", "4"}, {"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:7>"}}), new String[][]{{"getAnnotationIntrospector", "", "4"}, {"findEnumValue", "java.lang.Enum", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:3>"}}), new String[][]{{"constructRawMapType", "java.lang.Class", "7"}, {"isThrowable", "", "7"}, {"getReferencedType", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false), new String[][]{{"constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}), new String[][]{{"getPropertyNamingStrategy", "", "5"}, {"translate", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}), new String[][]{{"getDefaultImpl", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:9>"}, false, 2, new String[][]{}), new String[][]{{"getHandlerInstantiator", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}), new String[][]{{"getLocale", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}), new String[][]{{"getClassIntrospector", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:3>"}}), new String[][]{{"getPropertyNamingStrategy", "", "5"}, {"nameForSetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:4>"}}), new String[][]{{"getAnnotationIntrospector", "", "3"}, {"findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:7>"}}), new String[][]{{"findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("{getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"with", "com.fasterxml.jackson.core.Base64Variant", "7"}, {"getTimeZone", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getOffset", "long", "1"}, {"getDisplayName", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}}), new String[][]{{"findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "6"}, {"valueFor", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonInclude {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonInclude, getClasses=[class com.fasterxml.jacks...#755#-1498942298", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:5>"}}), new String[][]{{"getHandlerInstantiator", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:10>", "<sample:3>"}}), new String[][]{{"getAnnotationIntrospector", "", "7"}, {"findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<null>"}}, 3), new String[][]{{"getTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>"}}), new String[][]{{"getTypeResolverBuilder", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}), new String[][]{{"constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Integer, contains [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[...#748#-2094590019", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false), new String[][]{{"getBase64Variant", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}), new String[][]{{"with", "java.util.Locale", "1"}, {"getTimeZone", "", "1"}, {"getOffsets", "long,int[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:7>"}}), new String[][]{{"forDeserialization", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "1"}, {"findInjectables", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:8>"}}, 3), new String[][]{{"getDisplayName", "", "0"}, {"useDaylightTime", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"forSerialization", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"getDateFormat", "", "5"}, {"setDateFormatSymbols", "java.text.DateFormatSymbols", "2"}, {"setCalendar", "java.util.Calendar", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getDisplayName", "boolean,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 1), new String[][]{{"getMaxLineLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"getTimeZone", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:6>"}, false), new String[][]{{"getVisibilityChecker", "", "5"}, {"isIsGetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"getClassIntrospector", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<empty>"}}), new String[][]{{"getTypeResolverBuilder", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"getPropertyNamingStrategy", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}, 3), new String[][]{{"getDisplayLanguage", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}), new String[][]{{"getHandlerInstantiator", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}), new String[][]{{"getPropertyNamingStrategy", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}), new String[][]{{"getTypeFactory", "", "7"}, {"constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:1>"}}, 3), new String[][]{{"getTypeResolverBuilder", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"getHandlerInstantiator", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false), new String[][]{{"getPropertyNamingStrategy", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getDisplayName", "boolean,int,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"getTimeZone", "", "6"}, {"hasSameRules", "java.util.TimeZone", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getISO3Language", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}, 3), new String[][]{{"getTypeResolverBuilder", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 3), new String[][]{{"typeIdVisibility", "boolean", "7"}, {"getDefaultImpl", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 2), new String[][]{{"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}), new String[][]{{"allIntrospectors", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:6>", "<sample:10>"}, false, 0, null, 2), new String[][]{{"with", "java.util.Locale", "1"}, {"with", "com.fasterxml.jackson.core.Base64Variant", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 3), new String[][]{{"nameForField", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedField,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"hasSameRules", "java.util.TimeZone", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:3>"}}), new String[][]{{"getLocale", "", "6"}, {"getUnicodeLocaleKeys", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:4>"}}), new String[][]{{"getLocale", "", "4"}, {"getUnicodeLocaleType", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:2>"}}, 1), new String[][]{{"withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"getTimeZone", "", "3"}, {"isDirty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}), new String[][]{{"getLocale", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:7>"}, false), new String[][]{{"getPropertyNamingStrategy", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}), new String[][]{{"findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName={sample}0, scope=java.lang.Comparable, generatorType=java.lang.Number, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false), new String[][]{{"getVisibilityChecker", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false), new String[][]{{"getTimeZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}, 3), new String[][]{{"withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}), new String[][]{{"getPropertyNamingStrategy", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}), new String[][]{{"getClassIntrospector", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"addProperty", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "7"}, {"findMethod", "java.lang.String,java.lang.Class[]", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}}), new String[][]{{"getClassIntrospector", "", "7"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:6>"}, false), new String[][]{{"getTypeResolverBuilder", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:10>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}}), new String[][]{{"getClassIntrospector", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"typeIdVisibility", "boolean", "1"}, {"init", "com.fasterxml.jackson.annotation.JsonTypeInfo$Id,com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}), new String[][]{{"init", "com.fasterxml.jackson.annotation.JsonTypeInfo$Id,com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "1"}, {"isTypeIdVisible", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"getTypeResolverBuilder", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"getDateFormat", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3), new String[][]{{"getAnnotationIntrospector", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"getPropertyNamingStrategy", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false), new String[][]{{"inclusion", "com.fasterxml.jackson.annotation.JsonTypeInfo$As", "6"}, {"buildTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:2>"}}, 2), new String[][]{{"getVisibilityChecker", "", "4"}, {"isIsGetterVisible", "java.lang.reflect.Method", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"allIntrospectors", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:3>"}}, 1), new String[][]{{"isSetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "5"}, {"withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "1"}, {"isSetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 2), new String[][]{{"getPropertyNamingStrategy", "", "0"}, {"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "4"}, {"withDateFormat", "java.text.DateFormat", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"getPropertyNamingStrategy", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:1>"}, false), new String[][]{{"getTimeZone", "", "6"}, {"observesDaylightTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getDisplayVariant", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:8>"}, false, 0, null, 2), new String[][]{{"getDateFormat", "", "7"}, {"applyPattern", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}, 1), new String[][]{{"getTimeZone", "", "6"}, {"setRawOffset", "int", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=-2147483648,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=-214748...#219#278194307", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"usesPadding", "", "0"}, {"decode", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"getTypeResolverBuilder", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:3>"}}, 1), new String[][]{{"getPropertyNamingStrategy", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}, 1), new String[][]{{"getLastRuleInstance", "", "0"}, {"setRawOffset", "int", "5"}, {"inDaylightTime", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:7>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
