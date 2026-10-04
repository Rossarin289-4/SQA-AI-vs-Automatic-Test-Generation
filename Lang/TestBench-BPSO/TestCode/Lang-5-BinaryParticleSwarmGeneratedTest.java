package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"123456789m12345678901234567890"}, true, 0, null, 2), new String[][]{{"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "", "3"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1E?"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"\u00e9a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "3"}, {"remove", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"Invalid locaPe format:9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true), new String[][]{{"listIterator", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"/b/b1.5d"}, true), new String[][]{{"listIterator", "", "0"}, {"hasPrevious", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 3), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"-03p0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"J"}, true), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:4>"}, true), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"2147493648"}, true), new String[][]{{"retainAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"Titlf"}, true, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"contains", "java.lang.Object", "2"}, {"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 1), new String[][]{{"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"clear", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1e1}1L"}, true, 0, null, 1), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"retainAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"Invalid locaPe format::"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"get", "int", "2"}, {"getDisplayScript", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, a_0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"contains", "java.lang.Object", "6"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1e1"}, true), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"retainAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"2020-0-01"}, true), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:5>"}, true), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"i"}, true), new String[][]{{"isEmpty", "", "0"}, {"removeAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"2M"}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"0101"}, true), new String[][]{{"iterator", "", "2"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:0>"}, true), new String[][]{{"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 3), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"00"}, true, 0, null, 3), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"remove", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1."}, true), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"bbb"}, true), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 1), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "3"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"e.5g"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 3), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<empty>", "<null>"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<empty>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2020-01"}, true, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"subList", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[bg]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"\u00e92147484648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, sample__a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"isEmpty", "", "0"}, {"listIterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"aaaaaaabaaaaaaaa"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"abc"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaa`aaaaaaaa"}, true, 0, null, 1), new String[][]{{"size", "", "6"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1e10"}, true), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"/a/6b"}, true, 0, null, 1), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"removeAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"  C"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"5."}, true, 0, null, 2), new String[][]{{"listIterator", "", "6"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"listIterator", "int", "2"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"02;30:45"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"clear", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"--B"}, true, 0, null, 3), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"get", "int", "3"}, {"getScript", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.123456790123456"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 1), new String[][]{{"size", "", "3"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"cc"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("cc {getCountry=, getDisplayCountry=, getDisplayLanguage=cc, getDisplayName=cc, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=cc, getScr...#239#-300011168", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"PT1H010"}, true, 0, null, 2), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"<null>"}, true), new String[][]{{"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1234d56789012345678901234567890"}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 3), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"Ab,c"}, true, 0, null, 2), new String[][]{{"listIterator", "", "0"}, {"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"dc"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("dc {getCountry=, getDisplayCountry=, getDisplayLanguage=dc, getDisplayName=dc, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=dc, getScr...#239#-414980286", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"b"}, true, 0, null, 1), new String[][]{{"iterator", "", "5"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.82345678"}, true, 0, null, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"subList", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[kea]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"0L"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"cc1.5d1e10"}, true, 0, null, 3), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{" 123456789012345678901234567890"}, true, 0, null, 1), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.g"}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"size", "", "4"}, {"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 1), new String[][]{{"size", "", "2"}, {"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"subList", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[bg]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"removeAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"bb"}, true), new String[][]{{"getExtensionKeys", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"<a>b"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"J"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.5d0xFFFFFFFF"}, true, 0, null, 2), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"Invalid lcale format: 1.1234567"}, true, 0, null, 2), new String[][]{{"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"ii"}, true), new String[][]{{"removeAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true), new String[][]{{"getDisplayScript", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"12a4567890123456789012\"34567890"}, true, 0, null, 1), new String[][]{{"listIterator", "", "6"}, {"nextIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isEmpty", "", "6"}, {"iterator", "", "7"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2147483638"}, true, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"fi"}, true, 0, null, 2), new String[][]{{"getScript", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"cc"}, true, 0, null, 3), new String[][]{{"getScript", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"cd"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("cd {getCountry=, getDisplayCountry=, getDisplayLanguage=cd, getDisplayName=cd, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=cd, getScr...#239#-1135003842", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"listIterator", "int", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"listIterator", "", "7"}, {"previous", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"size", "", "7"}, {"subList", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ar_JO]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9"}, true, 0, null, 1), new String[][]{{"getVariant", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"Hello, Worle"}, true, 0, null, 3), new String[][]{{"listIterator", "", "5"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"nulll"}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"_a,bb,c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ab {getCountry=, getDisplayCountry=, getDisplayLanguage=Abkhazian, getDisplayName=Abkhazian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=abk, getLanguage=ab, getScript=, ge...#231#-1301437334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"_\u00e9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"hh"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("hh {getCountry=, getDisplayCountry=, getDisplayLanguage=hh, getDisplayName=hh, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=hh, getScr...#239#-754852832", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"cc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("cc {getCountry=, getDisplayCountry=, getDisplayLanguage=cc, getDisplayName=cc, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=cc, getScr...#239#-300011168", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"\u00e9h"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("\u00e9h {getCountry=, getDisplayCountry=, getDisplayLanguage=\u00e9h, getDisplayName=\u00e9h, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=\u00e9h, getScr...#239#1594000130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "2"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"\u00ea\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("\u00ea\u00e9 {getCountry=, getDisplayCountry=, getDisplayLanguage=\u00ea\u00e9, getDisplayName=\u00ea\u00e9, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=\u00ea\u00e9, getScr...#239#1139158466", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"cb"}, true, 0, null, 1), new String[][]{{"getDisplayLanguage", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("cb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ji"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ji {getCountry=, getDisplayCountry=, getDisplayLanguage=Yiddish, getDisplayName=Yiddish, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=yid, getLanguage=ji, getScript=, getVar...#227#-821665630", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"_Title"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ac"}, true, 0, null, 2), new String[][]{{"getLanguage", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ac", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"ca"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ca_FR, ca_ES, ca_IT, ca_AD]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 2), new String[][]{{"getDisplayLanguage", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sichuan Yi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"hi"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("hi {getCountry=, getDisplayCountry=, getDisplayLanguage=Hindi, getDisplayName=Hindi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=hin, getLanguage=hi, getScript=, getVariant...#223#-988737779", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"da"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("da {getCountry=, getDisplayCountry=, getDisplayLanguage=Danish, getDisplayName=Danish, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=dan, getLanguage=da, getScript=, getVaria...#225#-1381848975", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"TI7LE"}, true, 0, null, 1), new String[][]{{"listIterator", "int", "2"}, {"previous", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"i\u00e9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("i\u00e9 {getCountry=, getDisplayCountry=, getDisplayLanguage=i\u00e9, getDisplayName=i\u00e9, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=i\u00e9, getScr...#239#-1209694496", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"cc"}, true, 0, null, 1), new String[][]{{"getDisplayLanguage", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("cc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"_TTitle1E-5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ba"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ba {getCountry=, getDisplayCountry=, getDisplayLanguage=Bashkir, getDisplayName=Bashkir, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=bak, getLanguage=ba, getScript=, getVar...#227#1571215374", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"\u00e9e"}, true, 0, null, 3), new String[][]{{"getDisplayLanguage", "java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "6"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"cc"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("cc {getCountry=, getDisplayCountry=, getDisplayLanguage=cc, getDisplayName=cc, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=cc, getScr...#239#-300011168", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ab {getCountry=, getDisplayCountry=, getDisplayLanguage=Abkhazian, getDisplayName=Abkhazian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=abk, getLanguage=ab, getScript=, ge...#231#-1301437334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii_Title"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii_citle"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii_TCtle"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "2"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "1"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii_TC"}, true), new String[][]{{"hasExtensions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii__TC"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii__TC {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi (TC), getDisplayScript=, getDisplayVariant=TC, getISO3Country=, getISO3Language=iii, getLanguage=ii, g...#246#-972093496", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ih_TCC"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "0"}, {"next", "", "6"}, {"getDisplayCountry", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"_TTi"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"_UT"}, true, 0, null, 3), new String[][]{{"toLanguageTag", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("und-UT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"_UT_T"}, true), new String[][]{{"getUnicodeLocaleKeys", "", "6"}, {"isEmpty", "", "6"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "0"}, {"next", "", "6"}, {"getExtensionKeys", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "1"}, {"next", "", "3"}, {"getExtension", "char", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii_TC_\u00e9"}, true), new String[][]{{"toLanguageTag", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ii-TC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.LocaleUtils", "org.apache.commons.lang3.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"TH"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[th_TH]", SearchInputFactory_scaffolding.observe(actual));
 }
}
