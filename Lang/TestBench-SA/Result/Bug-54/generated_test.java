package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, true), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<empty>", "<sample:5>"}, true), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<null>"}, true), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:8>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0_sample, a_0, a, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:8>", "<null>"}, true, 0, null, 1), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:3>"}, true), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:0>"}, true), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:0>"}, true), new String[][]{{"contains", "java.lang.Object", "5"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "5"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true), new String[][]{{"retainAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.12345678901234577"}, true), new String[][]{{"retainAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"retainAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"--1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{",-L1-"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[_A, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1234567489012345678901234567890"}, true), new String[][]{{"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"nu2lnull"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"nXu2lnull"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"/t"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.k5d"}, true), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"http:/ewample.com/a?b=c"}, true, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"01"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"0+d/-1"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"X4"}, true), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"--11"}, true), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1L"}, true, 0, null, 3), new String[][]{{"set", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"/\n5/6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"listIterator", "", "0"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"/0E-=12456789011355678901234567890i"}, true), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"Title"}, true), new String[][]{{"isEmpty", "", "7"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1/01345668"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"t0x1F20___220Z-"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"http://example.cnm/a?b=c"}, true), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"htup9//xe\tmple.cnm/a?b=nnu2lmumlW\n"}, true, 0, null, 1), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 1), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"-,/"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"a,0xFFFFFFFF"}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"<-1.5"}, true), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"10"}, true, 0, null, 1), new String[][]{{"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"/0"}, true, 0, null, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"{ilf1.5f"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"erue"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"<a>4b=/aa>"}, true, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"bTILF"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("aa {getCountry=, getDisplayCountry=, getDisplayLanguage=Afar, getDisplayName=Afar, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=aar, getLanguage=aa, getScript=, getVariant=,...#221#1409221738", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"removeAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:5>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}, {"listIterator", "", "1"}, {"previous", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"aa2020-02-30T25:61:61"}, true, 0, null, 2), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"nu2lnullHello, World"}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"123456789012345-7890123456L7890 {ilf1.5f1234467890123456789012345678901.12345"}, true, 0, null, 1), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"\n123F456X89012345-7890123456L7890 {ilf1.5f12344467890123456789012345678901.12345"}, true, 0, null, 3), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"\n23F456X8901234]6-78A0123456L7890 {ilf1.5f123444779013456789012345678901.1234"}, true, 0, null, 2), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "", "0"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"clear", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"0xFEFFF7FFF"}, true, 0, null, 2), new String[][]{{"listIterator", "", "0"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"01"}, true, 0, null, 1), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"aac"}, true, 0, null, 1), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ab {getCountry=, getDisplayCountry=, getDisplayLanguage=Abkhazian, getDisplayName=Abkhazian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=abk, getLanguage=ab, getScript=, ge...#231#-1301437334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"ii"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ii_CN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"{ilf1.5ff"}, true, 0, null, 3), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true), new String[][]{{"getLanguage", "", "2"}, {"getUnicodeLocaleKeys", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"1.1a+c2..5b,b,E+1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"CC"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[en_CC]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"listIterator", "int", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ba"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ba {getCountry=, getDisplayCountry=, getDisplayLanguage=Bashkir, getDisplayName=Bashkir, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=bak, getLanguage=ba, getScript=, getVar...#227#1571215374", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"*+)0"}, true, 0, null, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"listIterator", "int", "7"}, {"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"{ilf1.5f"}, true, 0, null, 3), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true), new String[][]{{"getDisplayCountry", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"13013:3\":45"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"clear", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "", "5"}, {"iterator", "", "7"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ni"}, true), new String[][]{{"getUnicodeLocaleAttributes", "", "3"}, {"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true), new String[][]{{"stripExtensions", "", "7"}, {"getDisplayLanguage", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Afar", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true, 0, null, 3), new String[][]{{"getDisplayLanguage", "", "7"}, {"getDisplayLanguage", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Afar", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 3), new String[][]{{"getDisplayCountry", "", "7"}, {"getVariant", "", "5"}, {"getUnicodeLocaleAttributes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"indexOf", "java.lang.Object", "1"}, {"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"listIterator", "", "7"}, {"next", "", "6"}, {"getISO3Country", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"r{1.123456789012346"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true, 0, null, 2), new String[][]{{"getDisplayName", "", "0"}, {"getDisplayVariant", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true, 0, null, 1), new String[][]{{"getDisplayName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Afar", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"=W"}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"=W"}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "6"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"um"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("um {getCountry=, getDisplayCountry=, getDisplayLanguage=um, getDisplayName=um, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=um, getScr...#239#-2129447440", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"TH"}, true), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"`Wb1.132467\010Tiule0wFEFFFFFFr{1.1234567890124461.5d"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"`Je F{11234578901224567-1.5"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"Hello, Worl"}, true, 0, null, 3), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1e1p0.5"}, true, 0, null, 1), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("222", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"\t"}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"sruM"}, true, 0, null, 2), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"jj"}, true, 0, null, 3), new String[][]{{"getISO3Country", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1-D"}, true, 0, null, 2), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"Invalid l\u00e9daleformat:a1.12345678"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"o l"}, true, 0, null, 3), new String[][]{{"iterator", "", "3"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{",-L1-"}, true, 0, null, 2), new String[][]{{"listIterator", "", "3"}, {"previous", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"{\"\u00e9a\":<1~"}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.9f"}, true, 0, null, 3), new String[][]{{"listIterator", "", "2"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"U;;lHn"}, true, 0, null, 3), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ee"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ee {getCountry=, getDisplayCountry=, getDisplayLanguage=Ewe, getDisplayName=Ewe, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=ewe, getLanguage=ee, getScript=, getVariant=, h...#219#-1906141717", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ij"}, true, 0, null, 3), new String[][]{{"getDisplayScript", "", "3"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ij {getCountry=, getDisplayCountry=, getDisplayLanguage=ij, getDisplayName=ij, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=ij, getScr...#239#1755159998", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listIterator", "int", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"hi"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("hi {getCountry=, getDisplayCountry=, getDisplayLanguage=Hindi, getDisplayName=Hindi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=hin, getLanguage=hi, getScript=, getVariant...#223#-988737779", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 3), new String[][]{{"getDisplayName", "", "2"}, {"getDisplayName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sichuan Yi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 1), new String[][]{{"getLanguage", "", "4"}, {"stripExtensions", "", "3"}, {"getCountry", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"listIterator", "", "3"}, {"previous", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("aa {getCountry=, getDisplayCountry=, getDisplayLanguage=Afar, getDisplayName=Afar, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=aar, getLanguage=aa, getScript=, getVariant=,...#221#1409221738", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 2), new String[][]{{"clone", "", "1"}, {"getDisplayScript", "java.util.Locale", "5"}, {"getDisplayLanguage", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sichuan Yi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"subList", "int,int", "5"}, {"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("aa {getCountry=, getDisplayCountry=, getDisplayLanguage=Afar, getDisplayName=Afar, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=aar, getLanguage=aa, getScript=, getVariant=,...#221#1409221738", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"fb"}, true, 0, null, 2), new String[][]{{"getUnicodeLocaleKeys", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listIterator", "", "5"}, {"next", "", "7"}, {"getDisplayScript", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"get", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("nn {getCountry=, getDisplayCountry=, getDisplayLanguage=Norwegian Nynorsk, getDisplayName=Norwegian Nynorsk, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=nno, getLanguage=nn...#247#416311009", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"rn"}, true, 0, null, 1), new String[][]{{"getDisplayLanguage", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Rundi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "2"}, {"contains", "java.lang.Object", "3"}, {"iterator", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 1), new String[][]{{"getDisplayName", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sichuan Yi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "0"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"get", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("kea {getCountry=, getDisplayCountry=, getDisplayLanguage=Kabuverdianu, getDisplayName=Kabuverdianu, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=kea, getLanguage=kea, getScr...#239#1916218681", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"get", "int", "3"}, {"getCountry", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_tp//"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "6"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "3"}, {"next", "", "2"}, {"getScript", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_Dtq//1E-5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"th"}, true, 0, null, 2), new String[][]{{"removeAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"subList", "int,int", "5"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"sa_ b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "", "0"}, {"iterator", "", "0"}, {"next", "", "4"}, {"getExtensionKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isEmpty", "", "0"}, {"iterator", "", "0"}, {"next", "", "4"}, {"getExtensionKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht__tp//1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ht__tp//1 {getCountry=, getDisplayCountry=, getDisplayLanguage=Haitian Creole, getDisplayName=Haitian Creole (tp//1), getDisplayScript=, getDisplayVariant=tp//1, getISO3Country=, getISO3Language=hat, ...#266#412322874", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "6"}, {"next", "", "2"}, {"getExtension", "char", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_D;q/.1E-512:30:45TITLE"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_DBq/.1E-512:30\03745TITLE"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_DB"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ht_DB {getCountry=DB, getDisplayCountry=DB, getDisplayLanguage=Haitian Creole, getDisplayName=Haitian Creole (DB), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getI...#278#-54376481", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "1"}, {"next", "", "6"}, {"getDisplayLanguage", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "6"}, {"hasNext", "", "3"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "1"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"size", "", "6"}, {"iterator", "", "7"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "0"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
