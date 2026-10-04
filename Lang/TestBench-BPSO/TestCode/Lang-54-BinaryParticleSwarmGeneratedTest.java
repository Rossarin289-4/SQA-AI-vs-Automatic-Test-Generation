package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, a_0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"1:5dInvalid locale format: "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, a_0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"a b"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:3>"}, true), new String[][]{{"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.1234567890123"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"nmll"}, true), new String[][]{{"indexOf", "java.lang.Object", "6"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:6>"}, true), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"12"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"size", "", "5"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.12345678901233567"}, true), new String[][]{{"listIterator", "", "2"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"\010"}, true), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.123"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"retainAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"ji"}, true), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:3>"}, true), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"5/"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"12345678901234567890123567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<empty>", "<sample:3>"}, true), new String[][]{{"indexOf", "java.lang.Object", "4"}, {"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "3"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:6>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
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
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"get", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("nn {getCountry=, getDisplayCountry=, getDisplayLanguage=Norwegian Nynorsk, getDisplayName=Norwegian Nynorsk, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=nno, getLanguage=nn...#247#416311009", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"0x12356789"}, true), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"Hello- Worln"}, true, 0, null, 1), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:62:61"}, true, 0, null, 3), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"o"}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"1.5"}, true), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"listIterator", "int", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"2020-002-30T25:61:61\n"}, true, 0, null, 1), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"dx123556789"}, true), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"<a>b</b>"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"I12:30:45\n"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=cji"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"http://exampli.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.123456789012345\"ji"}, true), new String[][]{{"iterator", "", "4"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"a`aaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"\t"}, true, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{".1234567890123456"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[_A, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"http://exampli.com/a?b=cTitle"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:6>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"listIterator", "", "5"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 3), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"size", "", "5"}, {"listIterator", "", "3"}, {"hasPrevious", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"ull"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"iI"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"\u00ea\u00e9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"nuull"}, true, 0, null, 1), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isEmpty", "", "4"}, {"indexOf", "java.lang.Object", "5"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, sample__a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:4>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 1), new String[][]{{"get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"ii"}, true), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:6>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:6>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"iterator", "", "7"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"--p"}, true), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "isAvailableLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"retainAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ih"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ih {getCountry=, getDisplayCountry=, getDisplayLanguage=ih, getDisplayName=ih, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=ih, getScr...#239#-869821950", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"{\"F\":1}{"}, true, 0, null, 1), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"2020-02-30T15:61:61"}, true, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"ji"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ji_001]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c+1?"}, true, 0, null, 1), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"paaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"get", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("nn {getCountry=, getDisplayCountry=, getDisplayLanguage=Norwegian Nynorsk, getDisplayName=Norwegian Nynorsk, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=nno, getLanguage=nn...#247#416311009", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"<a>b<</a>"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}}Title"}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"ar\tb"}, true, 0, null, 3), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:6>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a_0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 3), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1:5dnvalid lodale format: "}, true, 0, null, 2), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"listIterator", "", "5"}, {"hasPrevious", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"56/"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"a b5/"}, true), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"P7"}, true, 0, null, 3), new String[][]{{"retainAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"010acc"}, true, 0, null, 3), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a_0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ab {getCountry=, getDisplayCountry=, getDisplayLanguage=Abkhazian, getDisplayName=Abkhazian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=abk, getLanguage=ab, getScript=, ge...#231#-1301437334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 1), new String[][]{{"getScript", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"iiI"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"{:a\":1}"}, true, 0, null, 2), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0_SAMPLE, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("bg {getCountry=, getDisplayCountry=, getDisplayLanguage=Bulgarian, getDisplayName=Bulgarian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=bul, getLanguage=bg, getScript=, ge...#231#1564543651", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"kh"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("kh {getCountry=, getDisplayCountry=, getDisplayLanguage=kh, getDisplayName=kh, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=kh, getScr...#239#-1099760186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"Bu1"}, true, 0, null, 2), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, 0_SAMPLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"iI1.5"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "3"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "5"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "5"}, {"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "2"}, {"iterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("222", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample__a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true), new String[][]{{"getUnicodeLocaleKeys", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"tru\t"}, true, 0, null, 2), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"abca b"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"hi"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("hi {getCountry=, getDisplayCountry=, getDisplayLanguage=Hindi, getDisplayName=Hindi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=hin, getLanguage=hi, getScript=, getVariant...#223#-988737779", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ji"}, true), new String[][]{{"getDisplayName", "", "4"}, {"stripExtensions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ji {getCountry=, getDisplayCountry=, getDisplayLanguage=Yiddish, getDisplayName=Yiddish, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=yid, getLanguage=ji, getScript=, getVar...#227#-821665630", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ji"}, true), new String[][]{{"getDisplayVariant", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listIterator", "", "5"}, {"previous", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"vi"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("vi {getCountry=, getDisplayCountry=, getDisplayLanguage=Vietnamese, getDisplayName=Vietnamese, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=vie, getLanguage=vi, getScript=, ...#233#1046167332", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"O1H"}, true, 0, null, 3), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("bg {getCountry=, getDisplayCountry=, getDisplayLanguage=Bulgarian, getDisplayName=Bulgarian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=bul, getLanguage=bg, getScript=, ge...#231#1564543651", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"iterator", "", "5"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"listIterator", "", "0"}, {"previous", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "3"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "1"}, {"next", "", "5"}, {"getDisplayCountry", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 2), new String[][]{{"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ij"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ij {getCountry=, getDisplayCountry=, getDisplayLanguage=ij, getDisplayName=ij, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=ij, getScr...#239#1755159998", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "localeLookupList", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "1"}, {"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0x1F"}, true, 0, null, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 3), new String[][]{{"getDisplayName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sichuan Yi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ii {getCountry=, getDisplayCountry=, getDisplayLanguage=Sichuan Yi, getDisplayName=Sichuan Yi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=iii, getLanguage=ii, getScript=, ...#233#876464563", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"o\u00e9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"4/"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"http://example.com.a?b=c"}, true, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 3), new String[][]{{"getDisplayCountry", "java.util.Locale", "5"}, {"hasExtensions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"jj"}, true, 0, null, 3), new String[][]{{"getISO3Country", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true), new String[][]{{"iterator", "", "7"}, {"next", "", "1"}, {"getDisplayName", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"isEmpty", "", "5"}, {"iterator", "", "5"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"iterator", "", "3"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ji"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ji {getCountry=, getDisplayCountry=, getDisplayLanguage=Yiddish, getDisplayName=Yiddish, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=yid, getLanguage=ji, getScript=, getVar...#227#-821665630", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"tp"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("tp {getCountry=, getDisplayCountry=, getDisplayLanguage=tp, getDisplayName=tp, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=tp, getScr...#239#-224489048", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ji"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ji {getCountry=, getDisplayCountry=, getDisplayLanguage=Yiddish, getDisplayName=Yiddish, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=yid, getLanguage=ji, getScript=, getVar...#227#-821665630", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ab {getCountry=, getDisplayCountry=, getDisplayLanguage=Abkhazian, getDisplayName=Abkhazian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=abk, getLanguage=ab, getScript=, ge...#231#-1301437334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ab"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ab {getCountry=, getDisplayCountry=, getDisplayLanguage=Abkhazian, getDisplayName=Abkhazian, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=abk, getLanguage=ab, getScript=, ge...#231#-1301437334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "countriesByLanguage", new String[]{"java.lang.String"}, new String[]{"ca"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ca_FR, ca_ES, ca_IT, ca_AD]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ij"}, true, 0, null, 1), new String[][]{{"getUnicodeLocaleAttributes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"va"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("va {getCountry=, getDisplayCountry=, getDisplayLanguage=va, getDisplayName=va, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=va, getScr...#239#-814439062", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ba"}, true, 0, null, 1), new String[][]{{"toLanguageTag", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ba", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ac"}, true, 0, null, 3), new String[][]{{"getISO3Language", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"bb"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("bb {getCountry=, getDisplayCountry=, getDisplayLanguage=bb, getDisplayName=bb, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=bb, getScr...#239#649950624", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "languagesByCountry", new String[]{"java.lang.String"}, new String[]{"TH"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[th_TH]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_t9://exampli.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_.9://exampli.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "7"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"hi"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("hi {getCountry=, getDisplayCountry=, getDisplayLanguage=Hindi, getDisplayName=Hindi, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=hin, getLanguage=hi, getScript=, getVariant...#223#-988737779", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ca"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ca {getCountry=, getDisplayCountry=, getDisplayLanguage=Catalan, getDisplayName=Catalan, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=cat, getLanguage=ca, getScript=, getVar...#227#-1549697374", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ta"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ta {getCountry=, getDisplayCountry=, getDisplayLanguage=Tamil, getDisplayName=Tamil, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=tam, getLanguage=ta, getScript=, getVariant...#223#-1852037660", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"iterator", "", "2"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht__.9://exampli.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("ht__.9://exampli.com/a?b=c {getCountry=, getDisplayCountry=, getDisplayLanguage=Haitian Creole, getDisplayName=Haitian Creole (.9://exampli.com/a?b=c), getDisplayScript=, getDisplayVariant=.9://exampl...#334#-26971114", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "availableLocaleSet", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_B_.9://exampli.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_B.9:_//exampli.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_BA.9:_//exampli.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "toLocale", new String[]{"java.lang.String"}, new String[]{"ht_BL_.9://exampli.com/a?b=c"}, true), new String[][]{{"getCountry", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BL", String.valueOf(actual));
 }
}
