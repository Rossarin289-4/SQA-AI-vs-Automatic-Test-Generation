package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:4>"}}), new String[][]{{"getDateFormat", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:7>"}}, 1), new String[][]{{"with", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:7>", "<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:4>"}}, 3), new String[][]{{"withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "1"}, {"with", "com.fasterxml.jackson.core.Base64Variant", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 2), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "6"}, {"getTimeZone", "", "5"}, {"getDisplayName", "boolean,int,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:2>"}}), new String[][]{{"getClassLoader", "", "0"}});
  assertNotNull(actual);
  assertEquals("jdk.internal.loader.ClassLoaders$PlatformClassLoader", actual.getClass().getName());
  assertEquals("{getDefinedPackages=[package java.sql, package sun.text.resources.cldr.ext, pack.., getName=platform, isRegisteredAsParallelCapable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:7>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<null>"}}), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "3"}, {"getDateFormat", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}, 2), new String[][]{{"getTypeResolverBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 2), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "0"}, {"getBase64Variant", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:2>"}}, 1), new String[][]{{"isIsGetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "6"}, {"isCreatorVisible", "java.lang.reflect.Member", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:3>"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}, 3), new String[][]{{"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2), new String[][]{{"usesPadding", "", "7"}, {"encode", "byte[],boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1), new String[][]{{"usesPadding", "", "7"}, {"encode", "byte[],boolean", "5"}, {"decodeBase64Char", "char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}}, 1), new String[][]{{"usesPadding", "", "7"}, {"encode", "byte[],boolean", "5"}, {"decodeBase64Byte", "byte", "5"}, {"encode", "byte[],boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}}, 1), new String[][]{{"usesPadding", "", "7"}, {"encode", "byte[],boolean", "5"}, {"decodeBase64Byte", "byte", "5"}, {"decodeBase64Byte", "byte", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:1>"}}, 2), new String[][]{{"getTimeZone", "", "6"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:1>"}}, 2), new String[][]{{"getBase64Variant", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:3>"}}, 1), new String[][]{{"getBase64Variant", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:3>"}}, 1), new String[][]{{"getBase64Variant", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}, 1), new String[][]{{"findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}}, 1), new String[][]{{"getBase64Variant", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"getID", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:1>"}}, 3), new String[][]{{"withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<null>"}}, 3), new String[][]{{"withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "2"}, {"getTypeResolverBuilder", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}}, 2), new String[][]{{"getTypeFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}}, 1), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getAnnotationIntrospector", "", "0"}, {"hasAnyGetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "1"}, {"findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 1), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 1), new String[][]{{"getHandlerInstantiator", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 1), new String[][]{{"getTypeResolverBuilder", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:2>"}}, 1), new String[][]{{"getTypeResolverBuilder", "", "5"}, {"buildTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:2>"}}, 3), new String[][]{{"withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "0"}, {"withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}, 1), new String[][]{{"with", "java.util.Locale", "0"}, {"getLocale", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}, 1), new String[][]{{"getLocale", "", "0"}, {"getDisplayLanguage", "java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}, 1), new String[][]{{"getLocale", "", "0"}, {"getDisplayLanguage", "java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<null>"}}, 1), new String[][]{{"getLocale", "", "0"}, {"getLocale", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<null>"}}, 1), new String[][]{{"getLocale", "", "0"}, {"getLocale", "", "7"}, {"getAnnotationIntrospector", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:2>"}}, 1), new String[][]{{"getLocale", "", "0"}, {"getDisplayLanguage", "java.util.Locale", "7"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:2>"}}, 1), new String[][]{{"getLocale", "", "0"}, {"getDisplayLanguage", "java.util.Locale", "7"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"getBase64Variant", "", "0"}, {"getLocale", "", "7"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 1), new String[][]{{"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getISO3Country", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getISO3Country", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A_0 {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A (0), getDisplayScript=, getDisplayVariant=0, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, ge...#244#-1938314541", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}, 2), new String[][]{{"getAnnotationIntrospector", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getClassIntrospector", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<null>"}}, 3), new String[][]{{"getTypeResolverBuilder", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:1>", "<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 1), new String[][]{{"getHandlerInstantiator", "", "7"}, {"with", "com.fasterxml.jackson.core.Base64Variant", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:2>"}}, 3), new String[][]{{"getTypeFactory", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:2>"}, false), new String[][]{{"getAnnotationIntrospector", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}), new String[][]{{"getTypeResolverBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}), new String[][]{{"getTypeResolverBuilder", "", "3"}, {"defaultImpl", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}), new String[][]{{"getTypeResolverBuilder", "", "3"}, {"defaultImpl", "java.lang.Class", "0"}, {"buildTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}), new String[][]{{"getDateFormat", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:3>"}}), new String[][]{{"getDateFormat", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A_0 {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A (0), getDisplayScript=, getDisplayVariant=0, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, ge...#244#-1938314541", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:1>"}, false), new String[][]{{"getBase64Variant", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:10>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>"}}), new String[][]{{"getAnnotationIntrospector", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}}), new String[][]{{"getLocale", "", "1"}, {"getDisplayCountry", "", "0"}, {"getISO3Country", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", new String[]{}, new String[]{}, false), new String[][]{{"isIsGetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}), new String[][]{{"translate", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}), new String[][]{{"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}}), new String[][]{{"usesPadding", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}}), new String[][]{{"getPropertyNamingStrategy", "", "7"}, {"translate", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:6>"}}), new String[][]{{"usesPadding", "", "7"}, {"encode", "byte[],boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}}), new String[][]{{"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false), new String[][]{{"findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "4"}, {"findDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "6"}, {"findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:3>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}}), new String[][]{{"getBase64Variant", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:3>"}}), new String[][]{{"getBase64Variant", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"hasAsValueAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"getAnnotationIntrospector", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<null>"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}}), new String[][]{{"getBase64Variant", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "5"}, {"getTypeResolverBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getID", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}}), new String[][]{{"getTypeFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "4"}, {"getBase64Variant", "", "4"}, {"decode", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "4"}, {"getBase64Variant", "", "4"}, {"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "2"}, {"getClassIntrospector", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}), new String[][]{{"getHandlerInstantiator", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"getTypeResolverBuilder", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}), new String[][]{{"withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "0"}, {"getDateFormat", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}), new String[][]{{"with", "java.util.Locale", "0"}, {"getLocale", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:9>"}}), new String[][]{{"getLocale", "", "0"}, {"getDisplayLanguage", "java.util.Locale", "7"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:9>"}}), new String[][]{{"getLocale", "", "0"}, {"getDisplayLanguage", "java.util.Locale", "7"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:9>"}}), new String[][]{{"getLocale", "", "0"}, {"getLocale", "", "7"}, {"getAnnotationIntrospector", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false), new String[][]{{"getLocale", "", "0"}, {"getDisplayLanguage", "java.util.Locale", "7"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:4>"}}), new String[][]{{"withDateFormat", "java.text.DateFormat", "5"}, {"withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "0"}, {"getBase64Variant", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:0>"}, false), new String[][]{{"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}}), new String[][]{{"withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"getAnnotationIntrospector", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}), new String[][]{{"withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "0"}, {"getTypeResolverBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}), new String[][]{{"getVisibilityChecker", "", "1"}, {"withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getISO3Country", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getISO3Country", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:1>"}}), new String[][]{{"constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchIn...#744#-719848922", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:5>"}}), new String[][]{{"getTypeFactory", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:1>"}}), new String[][]{{"usesPaddingChar", "char", "6"}, {"encodeBase64BitsAsChar", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:6>"}}), new String[][]{{"usesPaddingChar", "char", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"getDisplayScript", "", "2"}, {"getISO3Country", "", "5"}, {"getExtension", "char", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:1>"}}), new String[][]{{"getTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "7"}, {"getTypeFactory", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 1), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "7"}, {"getTypeFactory", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}, 1), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}, 1), new String[][]{{"getDateFormat", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"getDisplayName", "boolean,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:6>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 1), new String[][]{{"getDateFormat", "", "5"}, {"format", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"getDateFormat", "", "6"}, {"applyPattern", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"getDateFormat", "", "6"}, {"applyPattern", "java.lang.String", "0"}, {"setLenient", "boolean", "7"}, {"parse", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:5>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:6>"}}), new String[][]{{"getVisibilityChecker", "", "1"}, {"isIsGetterVisible", "java.lang.reflect.Method", "6"}, {"withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:0>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:6>"}}), new String[][]{{"getVisibilityChecker", "", "1"}, {"isIsGetterVisible", "java.lang.reflect.Method", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:1>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:6>"}}, 3), new String[][]{{"getVisibilityChecker", "", "1"}, {"isIsGetterVisible", "java.lang.reflect.Method", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:0>"}}, 1), new String[][]{{"getAnnotationIntrospector", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:0>"}}), new String[][]{{"getAnnotationIntrospector", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}), new String[][]{{"getPropertyNamingStrategy", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 2), new String[][]{{"getPropertyNamingStrategy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 2), new String[][]{{"getVisibilityChecker", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}), new String[][]{{"getVisibilityChecker", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}}, 3), new String[][]{{"getVisibilityChecker", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:2>"}}), new String[][]{{"decodeBase64Byte", "byte", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false), new String[][]{{"withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "3"}, {"getPropertyNamingStrategy", "", "3"}, {"nameForConstructorParameter", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:2>"}}, 2), new String[][]{{"decodeBase64Byte", "byte", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false), new String[][]{{"getTypeFactory", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}), new String[][]{{"forDirectClassAnnotations", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"resolveType", "java.lang.reflect.Type", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", ""}}, 3), new String[][]{{"forDirectClassAnnotations", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"resolveType", "java.lang.reflect.Type", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getTimeZone", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getBase64Variant", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}), new String[][]{{"getTimeZone", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false), new String[][]{{"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "1"}, {"getVisibilityChecker", "", "0"}, {"isGetterVisible", "java.lang.reflect.Method", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}}, 3), new String[][]{{"getBase64Variant", "", "4"}, {"getVisibilityChecker", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}, 1), new String[][]{{"getPropertyNamingStrategy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}, 1), new String[][]{{"getPropertyNamingStrategy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:7>"}, false, 12, new String[][]{}), new String[][]{{"getPropertyNamingStrategy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}}, 2), new String[][]{{"getPropertyNamingStrategy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", ""}}, 2), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}), new String[][]{{"getHandlerInstantiator", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}, 1), new String[][]{{"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<null>"}}, 3), new String[][]{{"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "4"}, {"with", "java.util.Locale", "4"}, {"getTimeZone", "", "0"}, {"getDSTSavings", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"constructType", "java.lang.reflect.Type,java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}), new String[][]{{"getClassIntrospector", "", "6"}, {"forDeserialization", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<null>"}}), new String[][]{{"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "4"}, {"withDateFormat", "java.text.DateFormat", "4"}, {"withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "4"}, {"getAnnotationIntrospector", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}), new String[][]{{"nameForConstructorParameter", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.String", "4"}, {"translate", "java.lang.String", "4"}, {"nameForGetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 2), new String[][]{{"getDSTSavings", "", "1"}, {"getOffsetsByStandard", "long,int[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:3>"}}), new String[][]{{"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "4"}, {"withDateFormat", "java.text.DateFormat", "4"}, {"getClassIntrospector", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:3>"}}), new String[][]{{"getTypeFactory", "", "4"}, {"constructCollectionLikeType", "java.lang.Class,java.lang.Class", "4"}, {"isInterface", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:3>"}}), new String[][]{{"getClassIntrospector", "", "5"}, {"forClassAnnotations", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:0>"}, false), new String[][]{{"with", "java.util.TimeZone", "1"}, {"getPropertyNamingStrategy", "", "7"}, {"nameForField", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedField,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", ""}}), new String[][]{{"with", "java.util.TimeZone", "1"}, {"getPropertyNamingStrategy", "", "7"}, {"nameForField", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedField,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}), new String[][]{{"with", "java.util.TimeZone", "1"}, {"getPropertyNamingStrategy", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:7>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 2), new String[][]{{"with", "java.util.TimeZone", "1"}, {"getPropertyNamingStrategy", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:7>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", ""}}, 2), new String[][]{{"with", "java.util.TimeZone", "1"}, {"getPropertyNamingStrategy", "", "7"}, {"nameForSetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false), new String[][]{{"init", "com.fasterxml.jackson.annotation.JsonTypeInfo$Id,com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "5"}, {"getDefaultImpl", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:5>"}}, 3), new String[][]{{"with", "java.util.TimeZone", "1"}, {"getPropertyNamingStrategy", "", "4"}, {"nameForSetterMethod", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:7>"}, false), new String[][]{{"withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "1"}, {"getTypeFactory", "", "0"}, {"constructRawCollectionLikeType", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Object, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, getTy...#533#2098989202", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:6>"}, false), new String[][]{{"getAnnotationIntrospector", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:7>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>"}}, 2), new String[][]{{"with", "java.util.TimeZone", "1"}, {"getPropertyNamingStrategy", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:2>"}}, 3), new String[][]{{"with", "java.util.TimeZone", "6"}, {"getPropertyNamingStrategy", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:2>"}}, 3), new String[][]{{"with", "java.util.TimeZone", "6"}, {"getPropertyNamingStrategy", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}, 3), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "3"}, {"withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "5"}, {"getClassIntrospector", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}), new String[][]{{"withDateFormat", "java.text.DateFormat", "1"}, {"getBase64Variant", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:0>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:8>"}}, 1), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "6"}, {"getPropertyNamingStrategy", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=<a><b>t</b></a>, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:3>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<empty>"}}, 2), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:0>"}}, 3), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "1"}, {"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "6"}, {"getBase64Variant", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Base64Variant", actual.getClass().getName());
  assertEquals("MIME-NO-LINEFEEDS {getMaxLineLength=2147483647, getName=MIME-NO-LINEFEEDS, getPaddingByte=61, getPaddingChar==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<empty>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}, 2), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "6"}, {"getBase64Variant", "", "4"}, {"usesPadding", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<null>"}}, 3), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "2"}, {"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "6"}, {"getBase64Variant", "", "4"}, {"usesPadding", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeFactory", new String[]{}, new String[]{}, false), new String[][]{{"constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false), new String[][]{{"getDateFormat", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:3>"}}, 1), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "2"}, {"getLocale", "", "6"}, {"getISO3Language", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:3>"}}, 3), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"getLocale", "", "6"}, {"getISO3Language", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:3>"}}, 2), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"getLocale", "", "6"}, {"getISO3Language", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:0>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}}, 1), new String[][]{{"getAnnotationIntrospector", "", "1"}, {"findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:0>"}}, 1), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "6"}, {"getVisibilityChecker", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:6>"}}, 2), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "6"}, {"getVisibilityChecker", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:4>"}, false), new String[][]{{"getVisibilityChecker", "", "3"}, {"isIsGetterVisible", "java.lang.reflect.Method", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getClassIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:3>"}}), new String[][]{{"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.TimeZone", "<sample:2>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:5>"}}, 3), new String[][]{{"withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "6"}, {"getVisibilityChecker", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:5>"}, false), new String[][]{{"withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "5"}, {"getTimeZone", "", "3"}, {"useDaylightTime", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}}), new String[][]{{"hasSameRules", "java.util.TimeZone", "0"}, {"getOffset", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}), new String[][]{{"getLastRuleInstance", "", "3"}, {"observesDaylightTime", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:7>"}}), new String[][]{{"getDateFormat", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:2>"}, false), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "7"}, {"getTimeZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:5>"}}, 1), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "1"}, {"withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "6"}, {"with", "java.util.Locale", "3"}, {"getLocale", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:5>"}}), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "3"}, {"formatToCharacterIterator", "java.lang.Object", "5"}, {"getAllAttributeKeys", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[java.text.DateFormat$Field(am pm), java.text.DateFormat$Field(hour 1), java.text.DateFormat$Field(minute), java.text.DateFormat$Field(second)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "com.fasterxml.jackson.core.Base64Variant", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "withDateFormat", "java.text.DateFormat", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserialization", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}, 1), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "7"}, {"withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "1"}, {"getAnnotationIntrospector", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withTypeResolverBuilder", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "with", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", ""}}, 1), new String[][]{{"withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "7"}, {"withVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "1"}, {"with", "java.util.TimeZone", "0"}, {"getPropertyNamingStrategy", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getPropertyNamingStrategy", ""}}), new String[][]{{"getDisplayName", "boolean,int,java.util.Locale", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false), new String[][]{{"buildTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:7>"}, false), new String[][]{{"withHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "1"}, {"getDateFormat", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"getLocale", "", "5"}, {"getUnicodeLocaleAttributes", "", "4"}, {"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}, {"withTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:7>"}, false), new String[][]{{"getVisibilityChecker", "", "3"}, {"isCreatorVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:6>"}, false), new String[][]{{"getTypeFactory", "", "4"}, {"constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withClassIntrospector", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}), new String[][]{{"getVisibilityChecker", "", "4"}, {"isSetterVisible", "java.lang.reflect.Method", "2"}, {"isSetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:4>", "<sample:4>"}, false), new String[][]{{"getDateFormat", "", "3"}, {"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample4:00:00 PM {length=16}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false), new String[][]{{"getHandlerInstantiator", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false), new String[][]{{"withClassIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "5"}, {"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getHandlerInstantiator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false), new String[][]{{"getLocale", "", "6"}, {"getAnnotationIntrospector", "", "2"}, {"findPropertyContentTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:6>"}, false), new String[][]{{"getLocale", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "with", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"getDisplayCountry", "java.util.Locale", "6"}, {"getDisplayLanguage", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"toZoneId", "", "7"}, {"getDisplayName", "java.time.format.TextStyle,java.util.Locale", "2"}, {"normalized", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneOffset", actual.getClass().getName());
  assertEquals("Z {getId=Z, getTotalSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:4>"}, {"com.fasterxml.jackson.databind.cfg.BaseSettings", "getTimeZone", ""}}), new String[][]{{"clone", "", "7"}, {"getDisplayName", "boolean,int,java.util.Locale", "2"}, {"getID", "", "1"}, {"getOffsetsByStandard", "long,int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}, 2), new String[][]{{"withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "4"}, {"getPropertyNamingStrategy", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.cfg.BaseSettings", "getVisibilityChecker", ""}}, 2), new String[][]{{"withTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "4"}, {"getPropertyNamingStrategy", "", "4"}, {"translate", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"buildTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "5"}, {"deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"buildTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "5"}, {"deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getTypeResolverBuilder", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"typeIdVisibility", "boolean", "5"}, {"getDefaultImpl", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "withPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:1>"}, false), new String[][]{{"getClassIntrospector", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.cfg.BaseSettings", "com.fasterxml.jackson.databind.cfg.BaseSettings", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getDisplayName", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
}
