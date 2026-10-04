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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"nu_l", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "' in language resource!'"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"TITu LE"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("titule", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"1ull"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "1Ey5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ul", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"any"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ani|ni", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s: >", "-12"}}), new String[][]{{"isMatch", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"Ttle"}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "comnon"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "I1.112345678"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tl|tli", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}}), new String[][]{{"isMatch", "java.lang.CharSequence", "3"}, {"isMatch", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"quleType must not be "}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kletipe|kvletipe-muSt|must-not-be", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "' in l`nguagge resource!'", "<sample:9>"}}, 1), new String[][]{{"guessLanguages", "java.lang.String", "4"}, {"getAny", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("german", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", "common"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"", "<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:0>", "<sample:6>", "<sample:10>"}, true), new String[][]{{"remove", "int", "6"}, {"getPhoneme", "", "2"}, {"getPhonemes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[D[ANY_LANGUAGE], Dn[ANY_LANGUAGE]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"sque"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "any"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "rruldTypd m9ust not be "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("german", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"1.12345678)"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "dI'"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"com", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"p0x1F"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "10"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:5>", "<sample:4>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"0x12345679"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "0x123456", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:10>"}, true, 0, null, 1), new String[][]{{"guessLanguages", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, italian, greeklatin, hungarian, any, dutch, turkish, english, portuguese, polish, romanian, french, czech]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"0T"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:T0>", "0"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"]y+", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF0"}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", ";*/*"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"d'"}, false, 2, new String[][]{}, 3), new String[][]{{"isSingleton", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", " aa"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:6>", ")-(112:30:45"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{".1", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s: m.>", "0"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"guessLanguages", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([spanish, hebrew, italian, portuguese, any, french]) {getAny=spanish, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"I", "<sample:7>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:3>", "<null>", ""}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"guessLanguage", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{" /"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:8>", "<sample:0>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:>", "10"}}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:T0>", "1"}}, 1), new String[][]{{"getPhonemes", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:3>", "/5"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "UTF,-82020-02-30T25:61:61"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61123456789012345678901234567890"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"010/*", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"guessLanguages", "java.lang.String", "1"}, {"restrictTo", "org.apache.commons.codec.language.bm.Languages$LanguageSet", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"0xFFFFFF2F"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ksf", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"1.1234567801234567"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getRContext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getPhonemes", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"guessLanguage", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{" "}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("title", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"0x12345679", "<sample:8>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("gS|gs|ks", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getRContext", ""}}, 1), new String[][]{{"getPhonemes", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"\\s+1e10"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("si", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"0i1.25"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getRContext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"guessLanguage", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"Hello,  Wrld"}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ila|ilu-vrlt", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{" .5d2020-02-30T25:61:61", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "comrmon", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"guessLanguages", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"ruleType must not be "}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([russian, hungarian, polish]) {getAny=russian, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"guessLanguage", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "+0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:>", "-2147483648"}}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "1.12345678901234567", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"1.1234567common"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "1.Cf-1.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:7>", "<sample:5>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{" .5d", "<sample:8>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apk|apts", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"0x123"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:>", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:>", "74"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:2>", "0E,5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"77", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"202002-30T25:61:61", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"-1)-("}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"0xFFFFFFF", "<sample:8>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ksf", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"-0.5"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "*/", "<sample:0>"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "*/i", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"*///", "<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:T0>", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"12:30:6"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"0x1F2147483648"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ksf", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:ea>", "-20"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"guessLanguage", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}}), new String[][]{{"isMatch", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "1.5e00"}}), new String[][]{{"isSingleton", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:5>", "<sample:4>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:a>", "9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:0>"}, true), new String[][]{{"guessLanguages", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:>", "67108884"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"' in language resource '"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:9>", "'"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:4>"}, true), new String[][]{{"guessLanguage", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:abd>", "-20"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "1e1a b"}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"-0.0a b"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ap", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "commonn", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"ruleType must not be "}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("rulitip|rulitipi-must-nut-b|bi|vi", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}}), new String[][]{{"isMatch", "java.lang.CharSequence", "5"}, {"isMatch", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:abc7>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:4>"}, true), new String[][]{{"guessLanguage", "java.lang.String", "6"}, {"guessLanguages", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([greek, german, spanish, russian, hebrew, italian, greeklatin, hungarian, any, cyrillic, dutch, arabic, turkish, english, portuguese, polish, romanian, french, czech]) {getAny=greek, isEmpty...#226#1974965915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:3>"}, true), new String[][]{{"guessLanguages", "java.lang.String", "4"}, {"isSingleton", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getRContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:0>", "<sample:6>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"guessLanguages", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([spanish, hebrew, italian, portuguese, any, french]) {getAny=spanish, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"2120-02-e30T25:61:61"}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--it", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:5>", "<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"a"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"nu_l"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nul", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"I1.12345678"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:2>"}, true), new String[][]{{"guessLanguages", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([spanish, hebrew, italian, portuguese, any, french]) {getAny=spanish, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<null>", "<sample:8>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<null>", "<sample:1>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:3>", "<sample:11>", "<sample:6>"}, true), new String[][]{{"clone", "", "7"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}), new String[][]{{"guessLanguage", "java.lang.String", "0"}, {"guessLanguage", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"' in language resource '--1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", ")"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([spanish, russian, english, hungarian, polish, any, romanian, french]) {getAny=spanish, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:5>", "<sample:3>", "<sample:6>"}, true), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "0x124456789"}}), new String[][]{{"getLanguages", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, cyrillic, english, french, german, hebrew, hungarian, polish, romanian, russian, spanish]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPhoneme", ""}, {"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"\n ", "<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"d"}, false, 6, new String[][]{}), new String[][]{{"getLanguages", "", "2"}, {"iterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"ruoeType must not be "}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "f"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "//"}}), new String[][]{{"isSingleton", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"0x12345679a", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("gza|ksa|sa", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"0x12345679", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"*/x", "<sample:4>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S|gS|gs|ks|s", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getLContext", new String[]{}, new String[]{}, false), new String[][]{{"isMatch", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"/L"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("l", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"(com"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kom|tsom", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"guessLanguages", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hungarian, polish, any, romanian, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"1.1234567890123456", "<sample:10>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"8s+"}, false, 0, null, 2), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "I"}}), new String[][]{{"getAny", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("german", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"anny"}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "common"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"\\\\+"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"f'"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "\\s+"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{" .5", "<sample:7>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"guessLanguages", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hungarian, polish, any, romanian, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:0>", "10"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{")/"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"isMatch", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getPhonemes", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:`>", "19"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s: >", "7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:6>", "TITu LE"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<null>", "27"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"ruleType ", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:1>", "<sample:0>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxPhonemes=0, getNameType=null, getRuleType=null, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", " .5*"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"/147483648", "<sample:10>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"PT1Htrue"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("btftrv|btftrvi|bthtrv|bthtrvi|bttrv|bttrvi", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "I1.123456)8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"Titmd", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "1.123456i78"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("titmt", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{" aa"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a|ai", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"'", "<sample:4>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"rue"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("rQ|ruj", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{" a`+1", "<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"1", "<sample:8>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:1>", "<sample:4>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"0xFFFWFFFFF"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ksf", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:4>", "<sample:9>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:1>", "1.123456+9"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"anyy"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ani|anii|ni|nii", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"2s47483648", "<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "1.1234577890123456", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{".i"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "20"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:a|>", "19"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:a>", "1"}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"TITu LE"}, false, 0, null, 1), new String[][]{{"isEmpty", "", "1"}, {"getLanguages", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, english, french, german, hungarian, polish, romanian, russian, spanish]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"b12:30:45Malformed line '", "<sample:10>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bmalformedline", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("l", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:>", "21"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"0xFFFFEFFF", "<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ksfef", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Lang", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getLContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"I1.12345678|"}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "TITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hungarian, polish, any, romanian, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:2>", "<sample:6>", "<sample:8>"}, true), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:7>", "<sample:7>", "<sample:4>"}, true), new String[][]{{"values", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "'a,b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("ASHKENAZI", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:7>", "<sample:9>", "<sample:6>"}, true), new String[][]{{"indexOf", "java.lang.Object", "1"}, {"indexOf", "java.lang.Object", "3"}, {"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstanceMap", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"<sample:4>", "<sample:5>", "<sample:8>"}, true), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("71", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguage", new String[]{"java.lang.String"}, new String[]{"rruleType m9ust not be "}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguage", "java.lang.String", "aanyy"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "isConcat", ""}}), new String[][]{{"guessLanguages", "java.lang.String", "5"}, {"contains", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=2, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.NameType", actual.getClass().getName());
  assertEquals("SEPHARDIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"**/"}, false, 6, new String[][]{{"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "+11e10"}, {"org.apache.commons.codec.language.bm.Lang", "guessLanguages", "java.lang.String", "PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.Languages$SomeLanguages", actual.getClass().getName());
  assertEquals("Languages([german, spanish, russian, english, hebrew, hungarian, polish, any, romanian, cyrillic, french]) {getAny=german, isEmpty=false, isSingleton=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:>", "47"}}, 1), new String[][]{{"getPhonemes", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:s >", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getRContext", ""}, {"org.apache.commons.codec.language.bm.Rule", "patternAndContextMatches", "java.lang.CharSequence,int", "<s:T>", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"isMatch", "java.lang.CharSequence", "6"}, {"isMatch", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("EXACT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "encode", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages$LanguageSet"}, new String[]{"+1M", "<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String", "d|"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPhoneme", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getPhonemes", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "loadFromResource", new String[]{"java.lang.String", "org.apache.commons.codec.language.bm.Languages"}, new String[]{"  //", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"guessLanguage", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("any", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=6, getNameType=ASHKENAZI, getRuleType=EXACT, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getInstance", new String[]{"org.apache.commons.codec.language.bm.NameType", "org.apache.commons.codec.language.bm.RuleType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:8>", "20220-02-30T25:61:61"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "instance", new String[]{"org.apache.commons.codec.language.bm.NameType"}, new String[]{"<sample:2>"}, true), new String[][]{{"guessLanguages", "java.lang.String", "0"}, {"getLanguages", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, french, hebrew, italian, portuguese, spanish]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.bm.Rule", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getMaxPhonemes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Rule", "org.apache.commons.codec.language.bm.Rule", "getRContext", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isMatch", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getRuleType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.bm.PhoneticEngine", "getNameType", ""}, {"org.apache.commons.codec.language.bm.PhoneticEngine", "encode", "java.lang.String,org.apache.commons.codec.language.bm.Languages$LanguageSet", "", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.codec.language.bm.RuleType", actual.getClass().getName());
  assertEquals("APPROX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=8, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.Lang", "org.apache.commons.codec.language.bm.Lang", "guessLanguages", new String[]{"java.lang.String"}, new String[]{"Helllo, World"}, false, 4, new String[][]{}, 3), new String[][]{{"restrictTo", "org.apache.commons.codec.language.bm.Languages$LanguageSet", "1"}, {"getAny", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.bm.PhoneticEngine", "org.apache.commons.codec.language.bm.PhoneticEngine", "getLang", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"guessLanguages", "java.lang.String", "4"}, {"getLanguages", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[any, french, hebrew, italian, portuguese, spanish]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMaxPhonemes=20, getNameType=SEPHARDIC, getRuleType=APPROX, isConcat=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
