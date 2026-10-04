package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"2020-01-01/a/ba b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"01.5d\t"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"abLc"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true), new String[][]{{"clear", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"a b"}, true), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"0x124456789"}, true), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<empty>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ar_JO {getCountry=JO, getDisplayCountry=Jordan, getDisplayLanguage=Arabic, getDisplayName=Arabic (Jordan), getDisplayScript=, getDisplayVariant=, getISO3Country=JOR, getISO3Language=ara, getLanguage=a...#248#-468735513", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"--1.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, a_0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1-.1"}, true), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"-r0.0"}, true), new String[][]{{"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.6d"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"set", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:2>"}, true), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "2"}, {"listIterator", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1e11"}, true), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{".5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:4>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"a bh"}, true), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<null>"}, true), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 3), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"--1.,"}, true), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"removeAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"-115"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"listIterator", "", "3"}, {"nextIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"Invalid locale foromat: "}, true), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, true), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"--1"}, true), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, sample__a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61\""}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}, {"add", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"TITLF"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"abLc"}, true), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"clear", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"1.123456789012345<6"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a_0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2020-02-01"}, true), new String[][]{{"listIterator", "", "5"}, {"previous", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567790"}, true, 0, null, 1), new String[][]{{"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.5TITLE"}, true), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"0x123456789 1"}, true, 0, null, 3), new String[][]{{"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"T"}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"isEmpty", "", "5"}, {"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"abc{\"a\":1}"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"aTITLE"}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "2"}, {"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"c."}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"{#a\":1}TITLE"}, true, 0, null, 2), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9"}, true, 0, null, 2), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"L"}, true, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"size", "", "6"}, {"iterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true), new String[][]{{"indexOf", "java.lang.Object", "7"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"get", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("kea {getCountry=, getDisplayCountry=, getDisplayLanguage=Kabuverdianu, getDisplayName=Kabuverdianu, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=kea, getLanguage=kea, getScr...#239#1916218681", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2020-01-01/a/{a babLc"}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, _A]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "1"}, {"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"size", "", "1"}, {"containsAll", "java.util.Collection", "4"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"subList", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[bg]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"Invalid lodale format: "}, true, 0, null, 1), new String[][]{{"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"set", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}_"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2020-T1-01/a/ba b-1"}, true, 0, null, 3), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, sample__a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"Title{\"a\":1}"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "4"}, {"listIterator", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"Hello, World\t"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab0xFFFFFFFF"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true), new String[][]{{"listIterator", "", "3"}, {"previous", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"c."}, true, 0, null, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{" b"}, true, 0, null, 3), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"get", "int", "2"}, {"getExtension", "char", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"subList", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ar_JO]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"P1HH"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listIterator", "", "0"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"subList", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[kea]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, sample__a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ab {getCountry=, getDisplayCountry=, getDisplayLanguage=Abkhazian, getDisplayName=Abkhazian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=abk, getLanguage=ab, getScript=, ge...#231#-1301437334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"01/"}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"size", "", "5"}, {"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"0x"}, true, 0, null, 2), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"20200-01-01"}, true, 0, null, 3), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a, sample__a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true, 0, null, 3), new String[][]{{"listIterator", "", "6"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"12345678901234567901234567890"}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 2), new String[][]{{"listIterator", "", "1"}, {"previous", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"\t"}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"bb"}, true, 0, null, 3), new String[][]{{"getDisplayName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "6"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"listIterator", "int", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"a "}, true, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"a0xFFFFFFFFI"}, true, 0, null, 1), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true, 0, null, 3), new String[][]{{"getDisplayScript", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<null>"}, true, 0, null, 1), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aa"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("aa {getCountry=, getDisplayCountry=, getDisplayLanguage=Afar, getDisplayName=Afar, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=aar, getLanguage=aa, getScript=, getVariant=,...#221#1409221738", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"listIterator", "int", "7"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"get", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("bg {getCountry=, getDisplayCountry=, getDisplayLanguage=Bulgarian, getDisplayName=Bulgarian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=bul, getLanguage=bg, getScript=, ge...#231#1564543651", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ac"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ac {getCountry=, getDisplayCountry=, getDisplayLanguage=ac, getDisplayName=ac, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=ac, getScr...#239#-70072932", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"f\u00e9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "6"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"bb"}, true, 0, null, 2), new String[][]{{"getDisplayVariant", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.5Ed"}, true, 0, null, 3), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"tu"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("tu {getCountry=, getDisplayCountry=, getDisplayLanguage=tu, getDisplayName=tu, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=tu, getScr...#239#-104485122", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true), new String[][]{{"getDisplayCountry", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"th"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[th_TH]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"aa b2020-02-30T25:61:61"}, true, 0, null, 1), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ab {getCountry=, getDisplayCountry=, getDisplayLanguage=Abkhazian, getDisplayName=Abkhazian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=abk, getLanguage=ab, getScript=, ge...#231#-1301437334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "0"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "5"}, {"next", "", "0"}, {"getDisplayLanguage", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true), new String[][]{{"getExtensionKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "1"}, {"next", "", "0"}, {"getDisplayVariant", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"bb"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("bb {getCountry=, getDisplayCountry=, getDisplayLanguage=bb, getDisplayName=bb, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=bb, getScr...#239#649950624", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"bc"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("bc {getCountry=, getDisplayCountry=, getDisplayLanguage=bc, getDisplayName=bc, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=bc, getScr...#239#-185042050", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_p://example.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "0"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"th"}, true, 0, null, 1), new String[][]{{"toLanguageTag", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("th", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"uh"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("uh {getCountry=, getDisplayCountry=, getDisplayLanguage=uh, getDisplayName=uh, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=uh, getScr...#239#2045515930", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"th"}, true, 0, null, 1), new String[][]{{"getISO3Language", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tha", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"th"}, true, 0, null, 3), new String[][]{{"getISO3Language", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tha", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"th"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("th {getCountry=, getDisplayCountry=, getDisplayLanguage=Thai, getDisplayName=Thai, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=tha, getLanguage=th, getScript=, getVariant=,...#221#69294343", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"th"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("th {getCountry=, getDisplayCountry=, getDisplayLanguage=Thai, getDisplayName=Thai, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=tha, getLanguage=th, getScript=, getVariant=,...#221#69294343", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"th"}, true, 0, null, 1), new String[][]{{"getDisplayVariant", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "2"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"to"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("to {getCountry=, getDisplayCountry=, getDisplayLanguage=Tongan, getDisplayName=Tongan, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=ton, getLanguage=to, getScript=, getVaria...#225#-1997880205", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"th"}, true, 0, null, 2), new String[][]{{"getDisplayLanguage", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Thai", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"tg"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("tg {getCountry=, getDisplayCountry=, getDisplayLanguage=Tajik, getDisplayName=Tajik, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=tgk, getLanguage=tg, getScript=, getVariant...#223#-1935847528", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"tr"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("tr {getCountry=, getDisplayCountry=, getDisplayLanguage=Turkish, getDisplayName=Turkish, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=tur, getLanguage=tr, getScript=, getVar...#227#1708357491", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_://example.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"th"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("th {getCountry=, getDisplayCountry=, getDisplayLanguage=Thai, getDisplayName=Thai, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=tha, getLanguage=th, getScript=, getVariant=,...#221#69294343", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ab {getCountry=, getDisplayCountry=, getDisplayLanguage=Abkhazian, getDisplayName=Abkhazian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=abk, getLanguage=ab, getScript=, ge...#231#-1301437334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "5"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"al"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("al {getCountry=, getDisplayCountry=, getDisplayLanguage=al, getDisplayName=al, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=al, getScr...#239#1004927594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_H://example.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_HF://example.comxa?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_H]//example.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "0"}, {"next", "", "0"}, {"getUnicodeLocaleAttributes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_HF"}, true), new String[][]{{"stripExtensions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ht_HF {getCountry=HF, getDisplayCountry=HF, getDisplayLanguage=Haitian Creole, getDisplayName=Haitian Creole (HF), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getI...#278#1597905119", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
