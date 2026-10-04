package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"2.1474836471E9", "-8.988465674311579E307"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"4.9E-324", "4.7421875", "2.1743961811521265E-4", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.04208441822398385", "28.57811783293146"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999993", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"-2.6190838401581408E-5", "NaN"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"5378525034886164398", "-44.2578125"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.0E-14"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("31.54304412135668", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"-2.1474836471E9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"-4.652362892704858E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"-4.4301812499999995", "10.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.399670563389096E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"-1.0319138160976205", "-14.9", "-1.5919138160976203", "4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"57.156235665862916", "8.988465674311579E307", "2.1474836470999997E9", "44"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"4.7421875", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"4.652362892704858E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.975523373078884", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"8.988465674311579E307", "-1.643181065367639E-4", "-4.294967294E9", "4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"3.50000000000001", "0.03508441822398385", "114.31247133172583", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.714578504670772E-7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"-0.975"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.1474836471E10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.8941469478027893E11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"57.59623566586291", "1.0757050069772329E19"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"10.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("12.801827480081469", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"114.56247133172583", "19.999999999999996", "114.31247133172583", "59"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.37109375", "1.0871980905760632E-4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999998617529", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.0", "11.456247133172583", "13.576097974741744", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"3.399464998481189E-5", "45.000046523628924"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000016", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"5.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.1780538303479458", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "1.0757050069772329E19"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.0E-14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("32.236191301916634", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"0.03508441822398385"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.3307423799363147", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.580887032249125E-4", "3.399464998481189E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9984657802056559", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"NaN", "-8.860362499999999", "-1.0319138160976205", "-2147483604"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"113.97247133172583", "2.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2571771655449575E-153", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"-119.19592071095099", "1.750000000000005", "0.9999999999999972", "-6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"114.56247133172583"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("427.1410900931445", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"-2.1474836471E9", "1.0000000000000003E-14"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"2147483647", "0.0015808870322491252", "0.0", "-4094"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"-1.0319138160976205"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"2.1474836471E9", "0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"8.988465674311579E307", "5.000000000000001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"4.7421875"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7972566643325765", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.1474836471000001E9", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"7.904435161245624E-5", "2.1474836471E9", "-2.1474836470999997E9", "-2147483606"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"14.136097974741745", "4.9E-324"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"-1.49", "5.3785250348861655E18"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"NaN", "2.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"99.41", "0.9999999999999972"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.033561698224839E-158", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.17983568189346322", "0.0035084418223983852"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.608505759767765", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"2147483647", "111.36247133172583"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"108.66247133172583", "0.16001699732499242"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.604467023961527E-263", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"5.201580887032249", "2.1474836471E10", "4.9E-324", "524244"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"5.715623566586292", "3.399464998481189E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.76765487493978E-29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"35.00003399464998", "2.4999999999999973"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.229114485036224E-28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"57.156235665862916", "3.50000000000001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.2603888610433324E-48", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"-1.7976931348623155E308", "24.57811783293146", "3.952217580622812E-5", "76"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"10.023"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("12.85364558374558", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"-1.7976931348623157E308", "2.1474836861E10", "1.7976931348623157E308", "-197"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"-18.5", "-59.5979603554755"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"5.599789735558277", "1.0737418235500002E9", "-0.0", "10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"1143.1247133172583", "2.0000000000000004"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.07374182355E9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.125409169581103E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"2.1026444172410485E-4", "8.98846567431158E307", "4.2949672941999993E9", "4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"9.56981875", "4.4942328371557893E307"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"-9.837447530487956E-5", "-2.1474836470759997E9", "229.23694266345166", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"114.56247133172583", "60.0", "28.57811783293146", "4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999998776309", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"10.43"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("13.779660515790304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.999999999999997", "57.281235665862916"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.1086244689504383E-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.4919138160976202", "28.578117832931465", "-3.9999534763710725", "-256"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.0070168836447967705", "57.15623566586291", "Infinity", "4098"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.553934937827958E-25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"4.999999999999999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.1780538303479426", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"28.578117832931458", "114.31247133172585"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.289342589604106E-22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"10.19", "48.356235665862926"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.637110227368453E-12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"4.2949672941999993E9", "3.8000000000000003", "2.1474836470879996E9", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"10.0", "0.5", "1.7976931348623157E308", "2147483606"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999998367738", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"10.0", "1.954", "1.7976931348623157E308", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.168627180816746E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"2.0E-14", "1.0E-15", "0.035084418223983845", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999999999323", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"57.112235665862926", "59.597960355475486"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.35634979877614453", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.0737418235499997E9", "28.57811783293146"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"110.06247133172583"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("405.91567485539537", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.1474836470999997E9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.399670563603971E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"14.136097974741746", "50.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999993930558", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"7.068048987370873", "28.578117832931458"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0748250010938955E-7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"3.952217580622812E-5", "2.3710937500000004"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999998831819848", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.0841688364479677", "9.999999999999998", "-0.0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995534439142", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.0017542209111991926", "1.944", "Infinity", "24"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.14344209409463282", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.1743961811521268E-4", "1.0", "57.15623566586292", "2147483621"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.416533809626701E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.0", "3.9999999999999996"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9816843611112658", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"4.348792362304253E-4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.74019131968414", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.03508441822398386", "28.57811783293146", "0.9999999999999972", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999923", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"57.21223566586291", "0.35000000000000103"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.086257344814966E-104", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"3.399464998481189E-5", "0.001688364479677055"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.9743825657969616E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"10.7", "0.32", "1.8000000000000007", "2147483604"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999998088", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"14.136097974741746", "35.1396375"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999805293190275", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"5.3785250348861645E18", "-1.0319138160976205", "0.059789735558275894", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.021042209111991925", "9.999999999999998E-15"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5134845836620133", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"4.999999999999999", "0.9999999999999971"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0036598468273436767", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.0737418235E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1254091694771313E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"-3.286362130735278E-4", "0.999999999999997"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"2.1474836470000002E9", "8.441822398385276E-5", "-159.19138160976203", "-118"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.03508441822398385", "57.156235665862916", "119.19592071095099", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"-5.660362500000001", "-17.664724999999997", "Infinity", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"5.0", "199.99999999999997", "-1.0E-14", "2"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"9.999999999999998", "228.62494266345166"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"28.57811783293146", "9.999999999999996"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2111282687397668E-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.0841688364479677", "57.03508441822398", "2.1474836470999997E9", "74"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.4914794051186605E-25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"28.578117832931458", "42.99978973555828", "8.988465674311579E307", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.008026629083323298", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"1.0", "0.04208441822398385"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.958788837905143", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"8.0", "19.999999999999996"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9992214099174926", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"4.0", "1.0319138160976205"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.02100766494341702", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"57.15623566586292"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("172.9833072602151", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"49.40808618390238", "2147483647", "2.1026444172410485E-4", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"20.15981875", "3.45900000000001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.977080842096883E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"28.57811783293146", "5.9999209556483875"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5235970861496567E-11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"7.45", "39.99999999999999", "-0.0", "1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999360832", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.0E-14"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("32.236191301916634", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"28.57811783293146"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("66.47959443812188", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.326181446352429E-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.668683979387428", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"8.0E-14", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.04208441822398385", "1.9999999999999998", "2.0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0064759388557932285", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.24999999999999997", "199.99999999999994"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.992007221626409E-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"20.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("39.3398841871995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.1474836471000004E8"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.905194172586812E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.1474836471E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.399670563603972E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"1.0E-14", "28.578117832931465", "4.8041875", "344"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1094237467877974E-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"2.1474836471E9", "8.441822398385275E-5", "0.0620930472578541", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"5.0E-15"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("32.92933848247658", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"2.1743961811521268E-4", "114.56247133172582", "4.6523628927048585E-5", "1073742079"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000049", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.1474836471E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.399670563603972E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.7795000000000052", "7.904435161245623E-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0428618315740264E-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.512", "14.160097974741745"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999998912832282", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"40.00002326181446", "114.31247133172583", "8.988465674311579E307", "22"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.084101823580599E-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"4.7511875", "14.136097974741746"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9988055153904264", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"45.99991784094673", "2.1474836470769994E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.1474836471E9", "2.0", "2.1743961811521265E-4", "-49"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.5", "2.1474836431E9", "4.294967294E9", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.40995081276234757", "2.6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.98341893126196", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.5", "170.56247133172582"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.000000000000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"4.2052888344820975E-4", "0.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9995608380035714", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"5.715623566586292", "2.1474836001000004E9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"1.0", "1.0000000000000002E-14", "1.0339999999999971", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.99999999999999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.440892098500626E-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.1474836471000001E9", "2.1474836411999998E9", "114.31247133172583", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999913911364197", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.005917840946731618", "3.16177406449825E-4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.043340562862395515", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"10.8", "0.0", "-10.0", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"28.57811783293146", "0.469"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"1.0", "7.399789735558276"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.1138129936318E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"4.2949672941999993E9", "114.56247133172583"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.9999999999999999", "0.5797897355582758"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5600161056606088", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.1474836471000001E9", "19.999999999999996", "4.652362892704858E-5", "26"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"1.580887032249125E-4", "1.9999999999999998", "28.57811783293146", "8251"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.4218271665740225E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"1.688364479677055E-4", "114.31247133172582"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.6629367034256575E-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.49999999999999856", "57.156235665862916"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.3306690738754696E-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"1.0", "1.7976931348623157E308", "57.15623566586292", "60"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.0701688364479677", "2.37109375", "0.3069738091615984", "29"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.003045456541040825", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"57.156235665862916", "40.12599999999999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9934379144952666", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"1.3900000000000001", "571.5623566586293"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.958504619076472E-248", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"5.8999999999999995", "3.50000000000001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.847079529624909", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"57.156235665862916", "46.65623566586292", "28.578117832931465", "10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.017510186410687977", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.1640000000000104", "1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7783171530420075", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"28.57811783293146", "8.988465674311579E307", "28.578117832931458", "59"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"50.0", "8.860362499999999", "56.716235665862925", "6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1002543729028673E-21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"1.0000000000000002E-14", "0.08010871980905761", "0.5", "30"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999799", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.5", "1.5808870322491246E-4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9858132605512746", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"228.62494266345166", "2.1474836470999998E8", "57.15623566586292", "113"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"3.5000000000000098", "4.742187499999999", "10.0", "20"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7848080844166696", String.valueOf(actual));
 }
}
