package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getRContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "2147483592"}}), new String[][]{{"isMatch", "java.lang.CharSequence", "0"}, {"isMatch", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"//", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"///0xFFFFFFFF", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "-1"}}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}, {"isMatch", "java.lang.CharSequence", "5"}, {"isMatch", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"abcacgbuleTyyqY m,rxt\037not e1.5f"}, false, 13, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("afkagbulitik|afkagbulitiki|afkagvulitik|afkagvulitiki|apkagbulitik|apkagbulitiki|apkagvulitik|apkagvulitiki|fkagbulitik|fkagbulitiki|fkagvulitik|fkagvulitiki|pkagbulitik|pkagbulitiki|pkagvulitik|pkagv...#236#263311489", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=32, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "010b"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "abbcr.leTyqd must\037not be y.1234567"}}, 3), new String[][]{{"guessLanguage", "java.lang.String", "3"}, {"guessLanguages", "java.lang.String", "7"}, {"restrictTo", "org.apache.commons.codec.language.bm.Languages$LanguageSet", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "", "<sample:3>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "abcr..leeTyqd ust\037nott\rbe y.12345671.12345672020-02-30T25:61:61"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 3), new String[][]{{"guessLanguages", "java.lang.String", "3"}, {"getAny", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("spanish", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "6Dlfoo<mxedg\037llioe!WDc+1d1"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}), new String[][]{{"guessLanguage", "java.lang.String", "0"}, {"guessLanguages", "java.lang.String", "5"}, {"getLanguages", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, english, french, german, hungarian, polish, romanian, russian, spanish]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=12, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "common"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"Thme"}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("german", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"com", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:a>", "19"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "12:30:45", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "12:30:45", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "12:30:45", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|\\+"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|\\*1.12345678901234560x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|*'1.122345678901234560x1F1.5abc"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|*'1.122345678901234560x1F1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|\\+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|*'1.122345678901234560x1F15"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|\\+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|'1.122345678901224560x1F15"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=256, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|\\+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "d"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=256, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|[+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=-2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "' in languge resource '", "<sample:3>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|[+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "' in languge resource '", "<sample:3>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|[+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "' in languge resource '", "<sample:3>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|[+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"1/n51e10"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "a,b,c", "<sample:4>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"1/n5 1e10"}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ne", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB11121E-5' in language resourde '"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nebeinlanguadZeresourde|nebeinlanguageresourde|nebeinlanguageresurde|nebeinlanguaxeresourde|nebeinlanhuageresourde", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB11121E-5' Din language resourde '"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nebedinlanguadZeresourde|nebedinlanguageresourde|nebedinlanguageresurde|nebedinlanguaxeresourde|nebedinlanhuageresourde", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB111121E-5' Din language resourde '"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB111121E-5' Din language resourde"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nebedinlanguadZeresourde|nebedinlanguageresourde|nebedinlanguageresurde|nebedinlanguaxeresourde|nebedinlanhuageresourde", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB111"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nep", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"d'"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB111121E-5'0Din languagf resourded'"}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nebedinlanguakfresourdet|nebedinlanguakfresurdet|nebedinlanhuakfresourdet", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getRContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "-1073741796"}}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "0"}, {"isMatch", "java.lang.CharSequence", "5"}, {"isMatch", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getRContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "-1073741796"}}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "0"}, {"isMatch", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getRContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "-1073741796"}}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:abc>", "-2147483648"}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "21"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:abc>", "-2147483648"}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "21"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:abc>", "-2147483648"}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "21"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:abc>", "-2147483648"}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "21"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"guessLanguages", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([spanish, italian, portuguese, any, french]) {getAny=spanish, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"guessLanguages", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hungarian, polish, any, romanian, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}}, 3), new String[][]{{"getPhonemes", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:>", "20"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "|\\*1.1113465789011244560ox1F1.12345678"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:4>", "u\\*1.1113465789011244560ox1F1.12345678"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"isMatch", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"isMatch", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"//", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"///", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"guessLanguage", "java.lang.String", "0"}, {"guessLanguages", "java.lang.String", "2"}, {"getLanguages", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, arabic, cyrillic, czech, dutch, english, french, german, greek, greeklatin, hebrew, hungarian, italian, polish, portuguese, romanian, russian, spanish, turkish]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"guessLanguage", "java.lang.String", "0"}, {"guessLanguages", "java.lang.String", "2"}, {"getLanguages", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, cyrillic, english, french, german, hebrew, hungarian, polish, romanian, russian, spanish]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"guessLanguage", "java.lang.String", "0"}, {"guessLanguages", "java.lang.String", "2"}, {"getLanguages", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, french, hebrew, italian, portuguese, spanish]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"guessLanguage", "java.lang.String", "4"}, {"guessLanguages", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([greek, german, spanish, russian, hebrew, italian, greeklatin, hungarian, any, cyrillic, dutch, arabic, turkish, english, portuguese, polish, romanian, french, czech]) {getAny=greek, isEmpty...#226#1974965915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"guessLanguage", "java.lang.String", "4"}, {"guessLanguages", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:a>", "19"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:a>", "19"}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:b>", "19"}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "12:30:45", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|*'1.122345678901234560x1F1.5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s: >", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|*'1.122345678901234560x1F15"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:1>", "<sample:5>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "0xFFFFFFFF"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "' in language resource '", "<sample:3>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|[+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "' in languge resource '", "<sample:3>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|[+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=4, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"2020-02-30T25:61:61", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "' in languge resource '", "<sample:3>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "|[+"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"'"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n5 1e10 "}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ne", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n5 1e10 1.12345678901234567"}, false, 13, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n-i-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=32, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n5 1eB10 1.12345678901234567"}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nep", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n5 1dB101.1234567890123456)"}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ndp", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5 1eB101123456789012D4567"}, false, 14, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nebt", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB101123356789012D4567"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nibt|nivt", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB101121E-5"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nib|nibi|nivi-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB101121E-5"}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nebe", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB101121E-5' in language resource '"}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nebeinlanguadZeresourse|nebeinlanguadZeresourtSe|nebeinlanguageresourse|nebeinlanguageresourtSe|nebeinlanguageresourtse|nebeinlanguageresurse|nebeinlanguaxeresourse|nebeinlanhuageresourse", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isMatch", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isMatch", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"isMatch", "java.lang.CharSequence", "0"}, {"isMatch", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:4>", "<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:7>", "<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"u"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "1/"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "1/n5 1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{")-("}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "Hello, World"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"Thme"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "1.5d"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "10n*+5:1eB111121E-5' Din language resourde"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("german", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "21"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:5>"}, true), new String[][]{{"guessLanguages", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([spanish, italian, portuguese, any, french]) {getAny=spanish, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:5>"}, true), new String[][]{{"guessLanguages", "java.lang.String", "5"}, {"getLanguages", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, french, italian, portuguese, spanish]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:7>"}, true), new String[][]{{"guessLanguages", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([greek, german, spanish, russian, hebrew, italian, greeklatin, hungarian, any, cyrillic, dutch, arabic, turkish, english, portuguese, polish, romanian, french, czech]) {getAny=greek, isEmpty...#226#1974965915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:0>"}, true), new String[][]{{"guessLanguages", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "|\\*1.1113465789011244560ox1F1.12345678"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isMatch", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "d'"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:0>", "<sample:7>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:1>", "<sample:7>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:7>", "<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:7>", "<sample:2>", "<sample:4>"}, true), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<null>", "19"}}), new String[][]{{"isMatch", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:7>"}, true), new String[][]{{"guessLanguage", "java.lang.String", "0"}, {"guessLanguages", "java.lang.String", "2"}, {"getLanguages", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, arabic, cyrillic, czech, dutch, english, french, german, greek, greeklatin, hebrew, hungarian, italian, polish, portuguese, romanian, russian, spanish, turkish]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"guessLanguage", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "a", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=12, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=32, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:3>", "<sample:7>", "<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:3>", "<sample:7>", "<sample:4>"}, true), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:1>", "<sample:1>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<null>", "<sample:6>", "b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<null>", "<sample:6>", "b1.5e310"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"d'"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"B'"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p|v", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"2020-0101/*"}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=12, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"2020-0101/*"}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=12, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"3*H020+01y*U1.51.5f020-02-30T25:61:61"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fiuf|hiuf|iuf--t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"3*H020+01y*U1.51.5fl020-02-30T25:61:61"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fiufl|hiufl|iufl--t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"guessLanguage", "java.lang.String", "1"}, {"guessLanguages", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([spanish, italian, portuguese, any, french]) {getAny=spanish, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}), new String[][]{{"guessLanguage", "java.lang.String", "1"}, {"guessLanguages", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hungarian, polish, any, romanian, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}), new String[][]{{"guessLanguage", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:ab>", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:a<>", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"|*'1.\\12234567890123+4560x1F1.5abc", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "4"}, {"isMatch", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"any"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([russian, hungarian, polish]) {getAny=russian, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"an"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hungarian, polish, any, romanian, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:3>", "<sample:1>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<null>", "<sample:6>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"' in language resource '", "<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"1.12345678901234567", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=12, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=32, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=32, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=256, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=-2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=256, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"1A*5:1B10211E-5010", "<sample:1>"}, false, 15, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "0x", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"1A*5:110211E-5010", "<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "0x", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"guessLanguages", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([spanish, italian, portuguese, any, french]) {getAny=spanish, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"guessLanguages", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, italian, greeklatin, hungarian, any, dutch, turkish, english, portuguese, polish, romanian, french, czech]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<null>", "6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:6>", "10n5 1e10 1.12345678901234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", ")-("}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"\\.w5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", ")-("}}, 2), new String[][]{{"contains", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([hungarian, polish, romanian]) {getAny=hungarian, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"a,b,>"}, false), new String[][]{{"restrictTo", "org.apache.commons.codec.language.bm.Languages$LanguageSet", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:7>", "<sample:4>", "<sample:6>"}, true, 0, null, 2), new String[][]{{"size", "", "3"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"10n5 1e10 1.12345678901234567"}, false), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "1"}, {"remove", "java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:6>", "<sample:0>", "<sample:10>"}, true, 0, null, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "1"}, {"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:3>", "<sample:6>", "<sample:10>"}, true, 0, null, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "1"}, {"putAll", "java.util.Map", "7"}, {"get", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "0"}, {"isMatch", "java.lang.CharSequence", "0"}, {"isMatch", "java.lang.CharSequence", "7"}, {"isMatch", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "0"}, {"isMatch", "java.lang.CharSequence", "0"}, {"isMatch", "java.lang.CharSequence", "7"}, {"isMatch", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:abc>", "20"}}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "5"}, {"isMatch", "java.lang.CharSequence", "1"}, {"isMatch", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:abc>", "20"}}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "5"}, {"isMatch", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:abc>", "20"}}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "5"}, {"isMatch", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"10n5 1eB10 1.12345678901234567)-("}, false, 1, new String[][]{}), new String[][]{{"getAny", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("german", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"10n5 1eB10 1.123456789x01234567)-("}, false, 1, new String[][]{}, 1), new String[][]{{"getAny", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("german", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"10n5 1dB1X 1/12456.89x01234567)-("}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"10n5 1dB1X 1/12456.89x01234567)-("}, false, 0, null, 1), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:4>", "any"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2), new String[][]{{"getPhonemes", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=12, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 1), new String[][]{{"guessLanguages", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=12, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 1), new String[][]{{"guessLanguages", "java.lang.String", "2"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=32, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 1), new String[][]{{"guessLanguages", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([spanish, hebrew, italian, portuguese, any, french]) {getAny=spanish, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}), new String[][]{{"guessLanguages", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=256, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=256, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 2), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=-2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 23, new String[][]{}, 2), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=4, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 25, new String[][]{}, 2), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 25, new String[][]{}), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}, {"getLanguages", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, french, hebrew, italian, portuguese, spanish]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=12, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}, {"getLanguages", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, cyrillic, english, french, german, hebrew, hungarian, polish, romanian, russian, spanish]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<null>", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "a,b,c"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", ")-(PT1H", "<sample:5>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 2), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}, {"getLanguages", "", "6"}, {"removeAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", ")-(PT1H", "<sample:5>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 1), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}, {"getLanguages", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, french, hebrew, italian, portuguese, spanish]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", ")-(PT1H", "<sample:5>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 1), new String[][]{{"guessLanguages", "java.lang.String", "6"}, {"isSingleton", "", "0"}, {"getLanguages", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, cyrillic, english, french, german, hebrew, hungarian, polish, romanian, russian, spanish]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:1>", "<sample:7>", "<sample:4>"}, true), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"/w"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "0x1b3456789"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "d'"}}, 3), new String[][]{{"contains", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"/w"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "0x1b3456789"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "d'"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "-1"}}, 3), new String[][]{{"getAny", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("german", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"w"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "d'"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "-1"}}), new String[][]{{"getLanguages", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, cyrillic, english, german, hebrew, polish]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "o"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:2>", "<sample:11>", "<sample:6>"}, true), new String[][]{{"get", "int", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:2>", "<sample:5>", "<sample:6>"}, true), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "M"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "M"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=12, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=32, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"H", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:4>", ""}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>"}, true, 0, null, 2), new String[][]{{"clear", "", "1"}, {"listIterator", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:8>", "<sample:4>", "<sample:6>"}, true, 0, null, 2), new String[][]{{"size", "", "1"}, {"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "-1"}}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}, {"isMatch", "java.lang.CharSequence", "5"}, {"isMatch", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"2.0\r"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("afk|apk|fk|pk", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apk|apts", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"b,b,c"}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pk|pts", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"bbdc"}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("btk|bts", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"bbbd"}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bt", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"bbbd"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bt|bvbt|bvt|vbt|vbvt|vvbt|vvt", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"10n*5:1eB111121E-5' Din lanuage re*o"}, false, 16, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "bb"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s: >", "2147483647"}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:0>", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
}
